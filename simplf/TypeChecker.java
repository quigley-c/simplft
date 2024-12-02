package simplf;

import java.util.List;
import java.util.ArrayList;

import simplf.Stmt.For;

class TypeChecker implements Expr.Visitor<DataType>, Stmt.Visitor<DataType> {
    public TypeEnvironment globals = new TypeEnvironment();
    private TypeEnvironment environment = globals;

    TypeChecker() {}
    TypeChecker(TypeEnvironment closing) {
        this.environment = closing;
    }

    public void interpret(List<Stmt> stmts) {
        try {
            for (Stmt stmt : stmts) {
                execute(stmt);
            }
        } catch (RuntimeError error) {
            Simplf.runtimeError(error);
        }
    }

    @Override
    public DataType visitExprStmt(Stmt.Expression stmt) {
        //System.out.println("expr stmt");
        return (DataType) evaluate(stmt.expr);
    }

    @Override
    public DataType visitPrintStmt(Stmt.Print stmt) {
        DataType val = (DataType) evaluate(stmt.expr);
        System.out.println(stringify(val));
        return null;
    }

    @Override
    public DataType visitVarStmt(Stmt.Var stmt) {
        //System.out.println("init var: " + stmt.name.lexeme);
        DataType t = (DataType) evaluate(stmt.initializer);
        environment = environment.define(
                stmt.name,
                stmt.name.lexeme,
                t);
        return DataType.NULL;
    }

    @Override
    public DataType visitBlockStmt(Stmt.Block stmt) {
        //System.out.println("block stmt");
        for(Stmt s : stmt.statements) {
            execute(s);
        }
        return DataType.NULL;
    }

    @Override
    public DataType visitIfStmt(Stmt.If stmt) {
        DataType b = (DataType) evaluate(stmt.cond);
        //System.out.println(b);
        if (b.equals(true)) {
            execute(stmt.thenBranch);
        } else {
            execute(stmt.elseBranch);
        }
        return b;
    }

    @Override
    public DataType visitWhileStmt(Stmt.While stmt) {
        while(evaluate(stmt.cond).equals(true)) {
            execute(stmt.body);
        }
        return null;
    }

    @Override
    public DataType visitForStmt(For stmt) {
        DataType val = (DataType) evaluate(stmt.init);
        while(evaluate(stmt.cond).equals(true)) {
            execute(stmt.body);
            evaluate(stmt.incr);
        }
        return null;
    }

    @Override
    public DataType visitFunctionStmt(Stmt.Function stmt) {
        SimplfFunction f = new SimplfFunction(stmt, stmt.type);
        environment = environment.define(stmt.name, stmt.name.lexeme, f.return_type);
        for (int i = 0; i < stmt.params.size(); i++) {
            Token t = stmt.params.get(i);
            environment = environment.define(t, t.lexeme, stmt.param_types.get(i));
        }
        return f.return_type;
    }

    @Override
    public DataType visitLogicalExpr(Expr.Logical expr) {
        DataType left = (DataType) evaluate(expr.left);
        if (expr.op.type == TokenType.OR) {
            if (isTruthy(left))
                return left;
        } else {
            if (!isTruthy(left))
                return left;
        }
        return (DataType) evaluate(expr.right);
    }

    @Override
    public DataType visitBinary(Expr.Binary expr) {
        DataType left = (DataType) evaluate(expr.left);
        DataType right = (DataType) evaluate(expr.right);

        switch (expr.op.type) {
            case PLUS:
                if (left == DataType.STRING || right == DataType.STRING) {
                    return DataType.STRING;
                }
                return checkNumbers(expr.op, left, right);
            case MINUS:
            case STAR:
            case SLASH:
            case GREATER:
            case GREATER_EQUAL:
            case LESS:
            case LESS_EQUAL:
                return checkNumbers(expr.op, left, right);
            case EQUAL_EQUAL:
            case BANG_EQUAL:
                assert (left == right) && (left == DataType.BOOL) && (right == DataType.BOOL);
                return DataType.BOOL;
            case COMMA:
                return right;
            default:
                break;
        }
        return null;
    }

    @Override
    public DataType visitUnary(Expr.Unary expr) {
        DataType right = (DataType) evaluate(expr.right);
        switch (expr.op.type) {
            case MINUS:
                checkNumber(expr.op, right);
                return right;
            case BANG:
                assert right == DataType.BOOL;
                return right;
            default:
                break;
        }
        return null;
    }

    @Override
    public DataType visitLiteral(Expr.Literal expr) {
        return (DataType) evaluate(expr);
    }

    @Override
    public DataType visitGrouping(Expr.Grouping expr) {
        return (DataType) evaluate(expr.expression);
    }

    @Override
    public DataType visitVarExpr(Expr.Variable expr) {
        // the value of the assoc list is, in this case, a type
        AssocList e = (AssocList) environment.get(expr.name);
        return (DataType) e.value;
    }

    @Override
    public DataType visitCallExpr(Expr.Call expr) {
        SimplfFunction f = (SimplfFunction) evaluate(expr.callee);
        for (int i = 0; i < expr.args.size(); i++) {
            assert environment.get(f.declaration.params.get(i)) == evaluate(expr.args.get(i));
        }
        return f.return_type;
    }

    private Object evaluate(Expr expr) {
        return expr.accept(this);
    }

    @Override
    public DataType visitAssignExpr(Expr.Assign expr) {
        DataType type = (DataType) evaluate(expr.value);
        //System.out.println(expr.name.lexeme + ": " + val);
        environment.assign(expr.name, type);
        return type;
    }

    @Override
    public DataType visitConditionalExpr(Expr.Conditional expr) {
        if (isTruthy((DataType) evaluate(expr.cond))) {
            return (DataType) evaluate(expr.thenBranch);
        } else {
            return (DataType) evaluate(expr.elseBranch);
        }
    }

    public DataType execute(Stmt stmt) {
        return stmt.accept(this);
    }

    private boolean isTruthy(DataType object) {
        if (object == null) {
            return false;
        }
        return true;
    }

    private boolean isEqual(DataType a, DataType b) {
        if (a == null)
            return b == null;
        return a.equals(b);
    }

    private void checkNumber(Token op, DataType object) {
        if (object == DataType.FLOAT)
            return;
        throw new RuntimeError(op, "Operand must be a number");
    }

    private DataType checkNumbers(Token op, DataType a, DataType b) {
        if (a == b && a != DataType.STRING && b != DataType.STRING)
            return a;
        throw new RuntimeError(op, "Type mismatch. Expected " + a.toString() + " found " + b.toString());
    }

    private String stringify(DataType object) {
        if (object == null)
            return "nil";
        if (object == DataType.FLOAT) {
            String num = object.toString();
            if (num.endsWith(".0")) {
                num = num.substring(0, num.length() - 2);
            }
            return num;
        }
        return object.toString();
    }


}

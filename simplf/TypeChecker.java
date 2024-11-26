package simplf;

import java.util.List;
import java.util.ArrayList;

import simplf.Stmt.For;

class TypeChecker implements Expr.Visitor<Object>, Stmt.Visitor<Object> {
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
    public Object visitExprStmt(Stmt.Expression stmt) {
        //System.out.println("expr stmt");
        return evaluate(stmt.expr);
    }

    @Override
    public Object visitPrintStmt(Stmt.Print stmt) {
        Object val = evaluate(stmt.expr);
        System.out.println(stringify(val));
        return null;
    }

    @Override
    public Void visitVarStmt(Stmt.Var stmt) {
        //System.out.println("init var: " + stmt.name.lexeme);
        DataType t = evaluate(stmt.initializer);
        environment = environment.define(
                stmt.name,
                stmt.name.lexeme,
                t);
        return null;
    }

    @Override
    public Object visitBlockStmt(Stmt.Block stmt) {
        //System.out.println("block stmt");
        for(Stmt s : stmt.statements) {
            execute(s);
        }
        return new Object();
    }

    @Override
    public Object visitIfStmt(Stmt.If stmt) {
        Object b = evaluate(stmt.cond);
        //System.out.println(b);
        if (b.equals(true)) {
            execute(stmt.thenBranch);
        } else {
            execute(stmt.elseBranch);
        }
        return b;
    }

    @Override
    public Object visitWhileStmt(Stmt.While stmt) {
        while(evaluate(stmt.cond).equals(true)) {
            execute(stmt.body);
        }
        return null;
    }

    @Override
    public Object visitForStmt(For stmt) {
        Object val = evaluate(stmt.init);
        while(evaluate(stmt.cond).equals(true)) {
            execute(stmt.body);
            evaluate(stmt.incr);
        }
        return null;
    }

    @Override
    public Object visitFunctionStmt(Stmt.Function stmt) {
        DataType f = evaluate(stmt);
        environment = environment.define(stmt.name, stmt.name.lexeme, f.return_type);
        for (Token t : stmt.params) {
            environment = environment.define(t, t.lexeme, t.data_type);
        }
        return f;
    }

    @Override
    public Object visitLogicalExpr(Expr.Logical expr) {
        Object left = evaluate(expr.left);
        if (expr.op.type == TokenType.OR) {
            if (isTruthy(left))
                return left;
        } else {
            if (!isTruthy(left))
                return left;
        }
        return evaluate(expr.right);
    }

    @Override
    public DataType visitBinary(Expr.Binary expr) {
        DataType left = evaluate(expr.left);
        DataType right = evaluate(expr.right);

        switch (expr.op.type) {
            case PLUS:
                if (left == DataType.STRING || right == DataType.STRING) {
                    return DataType.STRING;
                }
                return checkNumbers(expr.op, left, right);
            case MINUS:
                return checkNumbers(expr.op, left, right);
            case STAR:
                return checkNumbers(expr.op, left, right);
            case SLASH:
                return checkNumbers(expr.op, left, right);
            case GREATER:
                return checkNumbers(expr.op, left, right);
            case GREATER_EQUAL:
                return checkNumbers(expr.op, left, right);
            case LESS:
                return checkNumbers(expr.op, left, right);
            case LESS_EQUAL:
                return checkNumbers(expr.op, left, right);
            case EQUAL_EQUAL:
                return isEqual(left, right);
            case BANG_EQUAL:
                return !isEqual(left, right);
            case COMMA:
                return right;
            default:
                break;
        }
        return null;
    }

    @Override
    public Object visitUnary(Expr.Unary expr) {
        Object right = evaluate(expr.right);
        switch (expr.op.type) {
            case MINUS:
                checkNumber(expr.op, right);
                return -(double) right;
            case BANG:
                return !isTruthy(right);
            default:
                break;
        }
        return null;
    }

    @Override
    public Object visitLiteral(Expr.Literal expr) {
        return expr.type;
    }

    @Override
    public Object visitGrouping(Expr.Grouping expr) {
        return evaluate(expr.expression);
    }

    @Override
    public Object visitVarExpr(Expr.Variable expr) {
        // the value of the assoc list is, in this case, a type
        AssocList e = (AssocList) environment.get(expr.name);
        return e.value;
    }

    @Override
    public Object visitCallExpr(Expr.Call expr) {
        SimplfFunction f = (SimplfFunction) evaluate(expr.callee);
        for (int i = 0; expr.args.length(); i++) {
            assert expr.args[i].name.data_type == f.declaration[i].name.data_type;
        }
        return ret;
    }

    private DataType evaluate(Expr expr) {
        return expr.accept(this);
    }

    @Override
    public Object visitAssignExpr(Expr.Assign expr) {
        Object type = evaluate(expr.value);
        //System.out.println(expr.name.lexeme + ": " + val);
        environment.assign(expr.name, val);
        return type;
    }

    @Override
    public Object visitConditionalExpr(Expr.Conditional expr) {
        if (isTruthy(evaluate(expr.cond))) {
            return evaluate(expr.thenBranch);
        } else {
            return evaluate(expr.elseBranch);
        }
    }

    public Object execute(Stmt stmt) {
        return stmt.accept(this);
    }

    private boolean isTruthy(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof Boolean) {
            return (boolean) object;
        }
        return true;
    }

    private boolean isEqual(Object a, Object b) {
        if (a == null)
            return b == null;
        return a.equals(b);
    }

    private void checkNumber(Token op, Object object) {
        if (object instanceof Double)
            return;
        throw new RuntimeError(op, "Operand must be a number");
    }

    private DataType checkNumbers(Token op, DataType a, DataType b) {
        if (a == b)
            return a;
        throw new RuntimeError(op, "Type mismatch. Expected " + a.toString() + " found " + b.toString());
    }

    private String stringify(Object object) {
        if (object == null)
            return "nil";
        if (object instanceof Double) {
            String num = object.toString();
            if (num.endsWith(".0")) {
                num = num.substring(0, num.length() - 2);
            }
            return num;
        }
        return object.toString();
    }


}

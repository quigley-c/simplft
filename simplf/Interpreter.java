package simplf;

import java.util.List;
import java.util.ArrayList;

import simplf.Stmt.For;

class Interpreter implements Expr.Visitor<Object>, Stmt.Visitor<Object> {
    public Environment globals = new Environment();
    private Environment environment = globals;

    Interpreter() {}
    Interpreter(Environment closing) {
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
        Object val = evaluate(stmt.initializer);
        environment = environment.define(
                stmt.name,
                stmt.name.lexeme,
                val);
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
        SimplfFunction f = new SimplfFunction(stmt, new Environment(), stmt.type);
        environment = environment.define(stmt.name, stmt.name.lexeme, f);
        f.closure = environment;
        for (Token t : stmt.params) {
            environment = environment.define(t, t.lexeme, null);
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
    public Object visitBinary(Expr.Binary expr) {
        Object left = evaluate(expr.left);
        Object right = evaluate(expr.right);

        switch (expr.op.type) {
            case PLUS:
                if (left instanceof String || right instanceof String) {
                    return stringify(left) + stringify(right);
                }
                if (left instanceof Double && right instanceof Double) {
                    return (double) left + (double) right;
                }
                throw new RuntimeError(expr.op, "Addition operation not supported for operands.");
            case MINUS:
                checkNumbers(expr.op, left, right);
                return (double) left - (double) right;
            case STAR:
                checkNumbers(expr.op, left, right);
                return (double) left * (double) right;
            case SLASH:
                checkNumbers(expr.op, left, right);
                if ((double) right == 0) {
                    throw new RuntimeError(expr.op, "Cannot divide by zero.");
                }
                return (double) left / (double) right;
            case GREATER:
                checkNumbers(expr.op, left, right);
                return (double) left > (double) right;
            case GREATER_EQUAL:
                checkNumbers(expr.op, left, right);
                return (double) left >= (double) right;
            case LESS:
                checkNumbers(expr.op, left, right);
                return (double) left < (double) right;
            case LESS_EQUAL:
                checkNumbers(expr.op, left, right);
                return (double) left <= (double) right;
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
        return expr.val;
    }

    @Override
    public Object visitGrouping(Expr.Grouping expr) {
        return evaluate(expr.expression);
    }

    @Override
    public Object visitVarExpr(Expr.Variable expr) {
        AssocList e = (AssocList) environment.get(expr.name);
        return e.value;
    }
    @Override
    public Object visitCallExpr(Expr.Call expr) {
        SimplfFunction f = (SimplfFunction) evaluate(expr.callee);
        List<Object> args = new ArrayList();
        for (Expr a : expr.args) {
            args.add(evaluate(a));
        }
        Interpreter i = new Interpreter(f.closure);
        Object ret = f.call(i, args);
        return ret;
    }

    private Object evaluate(Expr expr) {
        return expr.accept(this);
    }

    @Override
    public Object visitAssignExpr(Expr.Assign expr) {
        Object val = evaluate(expr.value);
        //System.out.println(expr.name.lexeme + ": " + val);
        environment.assign(expr.name, val);
        return val;
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

    private void checkNumbers(Token op, Object a, Object b) {
        if (a instanceof Double && b instanceof Double)
            return;
        throw new RuntimeError(op, "Operand must be numbers");
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

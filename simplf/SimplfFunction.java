package simplf;

import java.util.List;

class SimplfFunction implements SimplfCallable {
    Stmt.Function declaration;
    Environment closure;
    DataType return_type;

    SimplfFunction(Stmt.Function declaration, Environment closure, DataType return_type) {
        this.declaration = declaration;
        this.closure = closure;
        this.return_type = return_type;
    }

    SimplfFunction(Stmt.Function declaration, DataType return_type) {
        this.declaration = declaration;
        this.closure = new Environment();
        this.return_type = return_type;
    }

    public void setClosure(Environment environment) {
        this.closure = environment;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> args) {
        for (int i = 0; i < args.size(); i++) {
            Token t = declaration.params.get(i);
            //System.out.println("fn param: " + t.lexeme);

            Expr.Literal e = new Expr.Literal(args.get(i));
            Stmt.Var stmt = new Stmt.Var(t, e, declaration.param_types.get(i));
            interpreter.visitVarStmt(stmt);
        }
        Object ret = new Object();
        for (Stmt s : declaration.body) {
            //System.out.print("execute stmt: ");
            ret = interpreter.execute(s);
            //System.out.println(ret);
        }

        return ret;
    }

    @Override
    public String toString() {
        return "<fn >";
    }

}

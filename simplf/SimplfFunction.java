package simplf;

import java.util.List;

class SimplfFunction implements SimplfCallable {
    Stmt.Function declaration;
    Environment closure;

    SimplfFunction(Stmt.Function declaration, Environment closure) {
        this.declaration = declaration;
        this.closure = closure;
    }

    public void setClosure(Environment environment) {
        this.closure = environment;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> args) {
        return true;
    }

    @Override
    public String toString() {
        return "<fn >";
    }

}

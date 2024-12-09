package simplf;

class TypeEnvironment {
    protected Token token;
    protected TypeEnvironment enclosing;
    protected AssocList data;

    TypeEnvironment() {
        // a fresh, clean env
    }

    TypeEnvironment(TypeEnvironment enclosing) {
        this.enclosing = enclosing;
    }

    TypeEnvironment(AssocList assocList, TypeEnvironment enclosing) {
        this.enclosing = enclosing;
        this.data = assocList;
    }

    // Return a new version of the environment that defines the variable "name"
    // and sets its initial value to "value". Take care to ensure the proper aliasing
    // relationship. There is an association list implementation in AssocList.java.
    // If your "define" function adds a new entry to the association list without
    // modifying the previous list, this should yield the correct aliasing
    // relationsip.
    //
    // For example, if the original environment has the association list
    // [{name: "x", value: 1}, {name: "y", value: 2}]
    // the new environment after calling define(..., "z", 3) should have the following
    //  association list:
    // [{name: "z", value: 3}, {name: "x", value: 1}, {name: "y", value: 2}]
    // This should be constructed by building a new class of type AssocList whose "next"
    // reference is the previous AssocList.
    TypeEnvironment define(Token varToken, String name, Object type) {
        //System.out.println("defining: " + name + " = " + value);
        AssocList newList = new AssocList(name, type, this.data);
        TypeEnvironment e = new TypeEnvironment(newList, this);
        return e;
    }

    void assign(Token name, Object value) {
        // don't assign, check the type
        AssocList e = (AssocList) get(name);
        assert e.value == value;
    }

    Object get(Token name) {
        AssocList cur = this.data;
        while(cur != null && cur.next != null) {
            if (cur.name.equals(name.literal)) { return cur; }
            cur = cur.next;
        }
        if (cur == null || !cur.name.equals(name.literal)) {
            Simplf.runtimeError(
                    new RuntimeError(
                        name, "Undefined Symbol: " + name.lexeme));
            throw new RuntimeException("Runtime Error");
        }
        return cur;
    }
}


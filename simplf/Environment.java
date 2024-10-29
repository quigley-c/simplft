package simplf;

class Environment {
    protected Token token;
    protected Environment enclosing;
    protected AssocList data;

    Environment() {
        // a fresh, clean env
    }

    Environment(Environment enclosing) {
        this.enclosing = enclosing;
    }

    Environment(AssocList assocList, Environment enclosing) {
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
    Environment define(Token varToken, String name, Object value) {
        AssocList newList = new AssocList(name, value, this.data);
        //System.out.println("new var " + name + " created with val: " + newList.value);
        Environment e = new Environment(newList, this);
        return e;
    }

    void assign(Token name, Object value) {
        AssocList e = (AssocList) get(name);
        e.value = value;
        //System.out.println("Assigned val " + value + " to " + name.literal);
    }

    Object get(Token name) {
        AssocList cur = this.data;
        while(cur.next != null) {
            if (cur.name.equals(name.literal)) {return cur;}
            cur = cur.next;
        }
        if (!cur.name.equals(name.literal)) {
            Simplf.runtimeError(
                    new RuntimeError(
                        name, "Undefined Symbol: " + name.literal));
            throw new RuntimeException("Runtime Error");
        }
        return cur;
    }
}


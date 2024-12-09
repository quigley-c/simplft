package simplf;

class TypeError extends RuntimeException {
    final Token token;

    TypeError(Token token, String message) {
        super(message);
        this.token = token;
    }

}

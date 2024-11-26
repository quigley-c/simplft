package simplf;

public class Token {
    final TokenType type;
    final int line, col;
    final String lexeme;
    final Object literal;
    final DataType data_type;

    public Token(TokenType type, String lexeme, Object literal, int line, int col) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
        this.col = col;
    }

    public Token(TokenType type, String lexeme, Object literal, int line, int col, DataType data_type) {
        this.type = type;
        this.lexeme = lexeme;
        this.data_type = data_type;
        this.literal = literal;
        this.line = line;
        this.col = col;
    }

    public String toString() {
        return "<" + type + ", " + lexeme + ", " + data_type + ", " + literal + ", " + line + ", " + col + ">";
    }
}

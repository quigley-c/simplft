// int i = 0;
Token var = new Token(TokenType.VAR, "int", new Literal("int"), 0, 0);
Token i = new Token(TokenType.IDENTIFIER, "i", new Literal("i"), 0, 0, DataType.FLOAT);
Token equal = new Token(TokenType.EQUAL, "=", new Literal("="), 0, 0);
Token num = new Token(TokenType.NUMBER, "0", new Literal("0"), 0, 0, DataType.FLOAT);
Token eof = new Token(TokenType.EOF, ";", new Literal(";"), 0, 0);


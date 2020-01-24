package com.bin;

public class Token {
    String value, type;
    int line;

    public Token(String value, String type, int line) {
        this.value = value;
        this.type = type;
        this.line = line;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return this.value + "[" + this.type + "," + this.line + "] ";
    }
}

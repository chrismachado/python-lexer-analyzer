package com.bin;

public class Tokens {
    String value, type, line;

    public Tokens(String value, String type, String line) {
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

    public String getLine() {
        return line;
    }

    @Override
    public String toString() {
        return this.value + "[" + this.type + "]";
    }
}

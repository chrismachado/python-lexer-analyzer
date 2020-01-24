package com.bin;
import java.io.File;


public class LexerGenMain {

    public static void main(String[] args) {
        String path = "src/com/rsc/pythonLexer.flex";
        generate(path);
    }
    public static void generate(String path) { JFlex.Main.generate(new File(path)); }
}

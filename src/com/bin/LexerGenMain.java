package com.bin;

import java.io.File;

import java_cup.runtime.*;

public class LexerGenMain {

    public static void main(String[] args) {
        /* WARNING: Do not do this, isn't a good practice.*/
        String path = "C:/Users/CHRISTIANO/IdeaProjects/PLA/src/com/rsc/Lexer2.flex";
        generate(path);
    }
    public static void generate(String path) { JFlex.Main.generate(new File(path)); }
}

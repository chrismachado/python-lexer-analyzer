import java.io.File;

public class LexerGenMain {

    public static void main(String[] args) {
        /* WARNING: Do not do this, isn't a good practice.*/
        String path = "C:/Users/CHRISTIANO/IdeaProjects/PLA/src/com/rsc/Lexer.flex";
        generate(path);
    }
    public static void generate(String path) { JFlex.Main.generate(new File(path)); }
}

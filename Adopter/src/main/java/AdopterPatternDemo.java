public class AdopterPatternDemo {

    public static void main(String[] args) {
        CompilerIDE xIde = new CompilerIDE();

        xIde.compile("java", "adopter.java");
        xIde.compile("kotlin", "adopter.kt");
        xIde.compile("c", "ccc.c");
        xIde.compile("c++", "c.cc");
    }
}

public class JavaCompiler implements AdvancedIntegratedDevelopmentEnvironment{
    @Override
    public void compileJava(String fileName) {
        System.out.println("Compiling Java file. Name: "+ fileName);
    }

    @Override
    public void compileKotlin(String fileName) {

    }
}

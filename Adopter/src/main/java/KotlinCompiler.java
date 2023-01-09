public class KotlinCompiler implements AdvancedIntegratedDevelopmentEnvironment{
    @Override
    public void compileJava(String fileName) {

    }

    @Override
    public void compileKotlin(String fileName) {
        System.out.println("Compiling Kotlin file. Name: "+ fileName);
    }
}

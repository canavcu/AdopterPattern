public class CompilerAdapter implements IntegratedDevelopmentEnvironment{

    AdvancedIntegratedDevelopmentEnvironment advancedIde;

    public CompilerAdapter(String compilerType){

        if(compilerType.equalsIgnoreCase("java") ){
            advancedIde = new JavaCompiler();

        }else if (compilerType.equalsIgnoreCase("kotlin")){
            advancedIde = new KotlinCompiler();
        }
    }

    @Override
    public void compile(String compileType, String fileName) {
        if(compileType.equalsIgnoreCase("java")){
            advancedIde.compileJava(fileName);
        }
        else if(compileType.equalsIgnoreCase("mp4")){
            advancedIde.compileKotlin(fileName);
        }
    }
}

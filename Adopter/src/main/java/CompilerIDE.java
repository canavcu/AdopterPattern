public class CompilerIDE implements IntegratedDevelopmentEnvironment{

    CompilerAdapter compilerAdapter;

    @Override
    public void compile(String compileType, String fileName) {
        if(compileType.equalsIgnoreCase("java") || compileType.equalsIgnoreCase("kotlin")){
            compilerAdapter = new CompilerAdapter(compileType);
            compilerAdapter.compile(compileType, fileName);
        }

        else{
            System.out.println("Invalid compiler. " + compileType + " format not supported");
        }
    }
}

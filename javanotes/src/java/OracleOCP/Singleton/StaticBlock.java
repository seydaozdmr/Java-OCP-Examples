package java.OracleOCP.Singleton;

import java.OracleOCP.NestedClasses.InnerStaticClass;

public class StaticBlock {
    private static StaticBlock instance;

    private StaticBlock(){}

    static {
        try{
            instance=new StaticBlock();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static StaticBlock getInstance(){
        return instance;
    }

    public static void getInfo(){
        System.out.println("static initializer");
    }
}

package javaocp.LambdaExamples.MethodReferance;

public class Example4 {
    public interface Yurutucu{
        public void run();
    }

    public static void main(String[] args) {
        Yurutucu yurutucu= ()-> System.out.println("merhaba dünya");
        yurutucu.run();

        Yurutucu yurutucu1=Example4::saySomething;
        yurutucu1.run();

        Thread t1=new Thread();
    }

    public static void saySomething(){
        System.out.println("merhaba java");
    }

}

package javaocp.LambdaExamples.MethodReferance;

public class Example2 {

    public static void saySomething(){
        System.out.println("merhaba"
        );
    }

    public static void main(String[] args) {
        Thread t=new Thread(()->saySomething());
        t.start();
        Thread t1=new Thread(()->System.out.println("asldjkalşsd"));
        t1.start();

        Thread t2=new Thread(Example2::saySomething);
        t2.start();
    }
}

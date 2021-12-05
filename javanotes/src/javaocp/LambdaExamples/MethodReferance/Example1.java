package javaocp.LambdaExamples.MethodReferance;

public class Example1 {
    public static void main(String[] args) {

        Sayable sayable=()-> System.out.println("asldjaslşd");

        Sayable sayable2=new Sayable() {
            @Override
            public void saySomething() {
                System.out.println("aslfjal");
            }
        };

        sayable.saySomething();


        Sayable sayable1= System.out::println;
        sayable1.saySomething();
    }

    private static void doSomething(Sayable sayable){

    }

    public static void printMessage(){
        System.out.println("my message");
    }

    @FunctionalInterface
    interface Sayable{
        void saySomething();
    }
}

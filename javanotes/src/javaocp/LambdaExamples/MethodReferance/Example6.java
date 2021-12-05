package javaocp.LambdaExamples.MethodReferance;

import java.util.function.Consumer;

public class Example6 {
    //String message ve consumer alan static method
    public static void saySomething(String message,Consumer<String> consumer){
        consumer.accept(message);
    }

    public static void main(String[] args) {
        //before
        Consumer<String> doSomething=p->System.out.println(p);

        saySomething("merhaba",p-> System.out.println(p));
        //after
        saySomething("merhaba java",System.out::println);

        //method reference substitute (e)->myConsumer(e);
        saySomething("merhaba komunite",Example6::myConsumer);



        saySomething("merhaba java komunite",myConsumer2);
    }

    public static void myConsumer(String message){
        System.out.println(message);
    }

    //Consumer'ı nesne haline getiriyoruz.
    static Consumer<String> myConsumer2=new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    };

    static Consumer<String> myConsumer3=(String s)-> System.out.println(s);
}

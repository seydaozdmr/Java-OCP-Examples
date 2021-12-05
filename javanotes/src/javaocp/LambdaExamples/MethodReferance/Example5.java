package javaocp.LambdaExamples.MethodReferance;

import java.util.function.Consumer;

public class Example5 {

    public static void main(String[] args) {
        String message="hello java";
        Consumer<String> consumer=m-> saySomething(m);
        consumer.accept(message);

        Consumer<String> consumer1=Example5::saySomething;
        consumer1.accept("hello community");


    }

    public static void saySomething(String message){
        System.out.println(message);
    }
}

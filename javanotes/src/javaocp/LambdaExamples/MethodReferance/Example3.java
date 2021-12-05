package javaocp.LambdaExamples.MethodReferance;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example3 {
    public static int alan(int x){
        return x*x;
    }

    public static void main(String[] args) {
        //eğer static ise [sınıf ismi]::[method ismi]
        Function<Integer,Integer> f=(x)->x*x;
        Function<Integer,Integer> function= Example3::alan;
        System.out.println(function.apply(10));

        Supplier<String> myString=String::new;
        Supplier<String> test=()->new String();
        Supplier<Example3> test2=Example3::new;
        Example3 example3= test2.get();

    }

}

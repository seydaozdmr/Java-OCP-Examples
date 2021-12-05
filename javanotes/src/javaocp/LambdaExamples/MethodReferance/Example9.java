package javaocp.LambdaExamples.MethodReferance;

import java.util.function.BiFunction;

public class Example9 {
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        Example9 myApp = new Example9();

        // Calling the method mergeThings with a lambda expression
        System.out.println(Example9.
                mergeThings("Hello ", "World!", (a, b) -> a + b));

        // Reference to a static method
        System.out.println(Example9.
                mergeThings("Hello ", "World!", Example9::appendStrings));

        // Reference to an instance method of a particular object
        System.out.println(Example9.
                mergeThings("Hello ", "World!", myApp::appendStrings2));

        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(Example9.
                mergeThings("Hello ", "World!", String::concat));
    }
}

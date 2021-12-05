package javaocp.LambdaExamples.MethodReferance;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example7 {
    //sınıfa ait predicate
    Predicate<Integer> myPredicate1=(Integer e)->e>10;

    public static void writeAfterFive(List<Integer> myList, Predicate<Integer> predicate){
        myList.stream().filter(predicate).forEach(System.out::println);
    }

    private static String toS(Integer a){
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        List<Integer> myList=List.of(1,2,3,4,5,6,7,8,9);
//        writeAfterFive(myList, (e)->e>5 );

        myList.stream().map(String::valueOf).collect(Collectors.toList()).forEach(System.out::println);

//        System.out.println("predicate");
//        writeAfterFive(myList,Example7::myPredicate);
//
//        System.out.println("Sınıfa ait predicate");




        //consumer:
//        myList.forEach(System.out::println);

    }

    public static boolean myPredicate(Integer e){
        return e>8;
    }


}


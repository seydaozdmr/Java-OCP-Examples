package javaocp.OracleOCP.Generics;

import java.util.List;
import java.util.Objects;

public class Exercise {
    /**
     * 1 - Write a generic method to count the number of elements in a collection
     * that have a specific property (for example, odd integers, prime numbers, palindromes).
     */
    private static <T> int countNumberOfElements (List<T> elements, UnaryPredicate<T> p){
        int count =0;
        for(T elem : elements){
            if(p.test(elem))
                ++count;
        }
        //return count;

        return (int) elements.stream().map(p::test).count();
    }
    interface UnaryPredicate<T> {
        boolean test(T obj);
    }

    /**
     * 2- Will the following class compile? If not, why?
     * T tipi comparable olmadığı için bu kod compile edilmez..
     */
//    public static <T> T max(T x, T y) {
//        return x > y ? x : y;
//    }

    /**
     * 3 - Write a generic method to exchange the positions of two different elements in an array.
     */

    private static <T> List<T> exchangePosition(List<T> list,T e1,T e2){
        int position1= list.indexOf(e1);
        int position2= list.indexOf(e2);
        list.set(position1,e2);
        list.set(position2,e1);

        return list;
    }

    /**
     * 6- What is the following method converted to after type erasure?
     */

    public static int findFirstGreaterThan ( Comparable [] at,Comparable elem){
        for(int i=0;i<at.length;i++){
            if(at[i].compareTo(elem)>0)
                return i;
        }
        return -1;
    }

    /**
     * @param list T tipinde listeyi alıp belirli bir aralıktaki en büyük elemanını geri dönüyoruz
     * @param begin başlangıç indexi
     * @param end bitiş indexi
     * @param <T>  çalışılacak tip
     * @return
     */
    private static <T extends Objects & Comparable<? super T>> T max (List<? extends T> list,int begin , int end){
        T element = list.get(begin);
        for(++begin;begin<end;begin++){
            if(list.get(begin).compareTo(element)>0)
                element=list.get(begin);
        }

        return element;
    }

    /**
     * 9 - Will the following class compile? If not, why?
     */

    class Singleton<T> {

//        public static T getInstance() {
//            if (instance == null)
//                instance = new Singleton<T>();
//
//            return instance;
//        }

        //private static T instance = null; //T tipinde static alan olamaz...
    }

    /**
     * Given the following classes
     */

    class Shape { /* ... */ }
    class Circle extends Shape { /* ... */ }
    class Rectangle extends Shape { /* ... */ }

    class Node<T> { /* ... */ }

    /**
     * 10 - Will the following code compile? If not, why? */
     Node<Circle> nc = new Node<>();
     // Node<Circle> Node<Shape> 'in alt türü (sub class'ı) değildir. Node<Shape>  ns = nc;


    /**
     * NodeComp<T> Comparable<T>'nin alt türü olduğu için birbiri yerine kullanılabilir
     * @param <T>
     */
    class NodeComp<T> implements Comparable<T> {
        public int compareTo(T obj) { /* ... */ }
        // ...
    }
    NodeComp<String> n1=new NodeComp<>();
    Comparable<String> s1=n1;


    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }


    public static void main(String[] args) {

    }
}

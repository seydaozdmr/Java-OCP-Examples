package javaocp.OracleOCP.Generics;

import java.io.Serializable;
import java.util.ArrayList;

public class NaturalNumber <T extends Number>{
    private final T t;

    public NaturalNumber(T t) {
        this.t = t;
    }
    public boolean isEven(){
        return t.intValue() % 2 ==0;
    }

    /**
     * Bounded type parameters are key to the implementation of generic algorithms.
     * Consider the following method
     * that counts the number of elements in an array T[]
     * that are greater than a specified element elem.
     */

    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            //if (e > elem)  // compiler error
                ++count;
        return count;
    }

    /**
     * The implementation of the method is straightforward,
     * but it does not compile because the greater than operator (>)
     * applies only to primitive types such as
     * short, int, double, long, float, byte, and char.
     * You cannot use the > operator to compare objects. To fix the problem,
     * use a type parameter bounded by the Comparable<T> interface:
     */
    public static <T extends Comparable<T>> int countGreaterThan(T [] anArray , T elem){
        int count=0;
        for(T e:anArray){
            if(e.compareTo(elem)>0)
                count++;
        }
        return count;
    }

    //T tipinde geri dönüş yapıyoruz
    static <T> T pick(T a1, T a2) {
        return a2;
    }
    Serializable s = pick("d", new ArrayList<String>());
}

package javaocp.OracleOCP.Generics;

public class TestOrderedPair {
    public static void main(String[] args) {
        Pair<Integer,String> myPairs= new OrderedPair<>(10,"artemis");

        /**
         * You can also substitute a type parameter (that is, K or V)
         * with a parameterized type (that is, List<String>).
         * For example, using the OrderedPair<K, V> example:
         */
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(10));
        System.out.println(p.getKey());
        System.out.println(p.getValue());

        /**
         * A raw type is the name of a
         * generic class or interface without any type arguments. For example, given the generic Box class:
         */

        Box<Integer> numBox=new Box<>(100);
        Box rawBox=numBox;

        rawBox =new Box("name");
        Box<String> charBox=rawBox;// warning: unchecked conversion


        //Generic methods example
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);

        Pair<Integer, String> p3 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p4 = new OrderedPair<>(2, "pear");
        boolean same2 = Util.compare(p3, p4);
        System.out.println(same2);

        /**
         *
         */
    }
}

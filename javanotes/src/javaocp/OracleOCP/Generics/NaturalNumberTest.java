package javaocp.OracleOCP.Generics;

public class NaturalNumberTest {
    public static void main(String[] args) {
        NaturalNumber<Integer> number=new NaturalNumber<>(10);
        Object o = NaturalNumber.pick(10,"h");
        System.out.println((String) o);



    }
}

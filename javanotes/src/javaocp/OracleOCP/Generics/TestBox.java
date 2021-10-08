package javaocp.OracleOCP.Generics;

import java.util.ArrayList;
import java.util.List;

public class TestBox {
    public static void main(String[] args) {
        Box<Integer> intBox=new Box<>(5);
        intBox.setT(10);
        System.out.println(intBox.getT());
        List<Box<Integer>> boxes = new ArrayList<>();
        /**
         * Generic Methods introduced you to type inference,
         * which enables you to invoke a generic method as you would an ordinary method,
         * without specifying a type between angle brackets.
         * Consider the following example, BoxDemo, which requires the Box class:
         */

        //Burada methodları çağırırken Box.<Integer>addBox() demedik çünkü java tipi kendisi çıkarıyor
        Box.addBox(10,boxes);
        Box.addBox(100,boxes);

        Box.outputBoxes(boxes);
    }
}

package javaocp.OracleOCP.Generics;

import java.util.ArrayList;
import java.util.List;

//Box <T> generic type sınıf isminden sonra yazılıyor.
public class Box <T>{
    //T tipinde bir değişken tutuyor ve gerekli davranışlara sahip
    T t;

    public Box(){}

    public Box(T t) {
        this.t = t;
    }

    public void setT(T val){
        this.t=val;
    }
    public T getT(){
        return t;
    }

    /**
     * There may be times when you want to restrict the types that can be used as
     * type arguments in a parameterized type. For example, a method that operates
     * on numbers might only want to accept instances of Number or its subclasses.
     * This is what bounded type parameters are for.
     */

    //burada istenen U Number tipinden türemiş olmalı
    public <U extends Number> void inspect(U u){
        System.out.println("T : "+ t.getClass().getName());
        System.out.println("U : "+u.getClass().getName());
    }
    //integerBox.inspect("some text"); // error: this is still String!
    // böyle bir kod karşılığında U her zaman Number ve onun alt tiplerinden biri olmalı.


    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.setT(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box: boxes) {
            U boxContents = box.getT();
            System.out.println("Box #" + counter + " contains [" +
                    boxContents.toString() + "]");
            counter++;
        }
    }
    //Listten sonra gelen 
    public static <T extends String> List<Integer> boxContent(List<Box<T>> boxes ){
        List<Integer> boxesCharNums=new ArrayList<>();
        for(Box<T> elem:boxes){
            boxesCharNums.add(elem.getT().length());
        }
        return boxesCharNums;
    }


    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}

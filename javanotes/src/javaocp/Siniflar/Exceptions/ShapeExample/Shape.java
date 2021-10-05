package javaocp.Siniflar.Exceptions.ShapeExample;

public abstract class Shape {

    public abstract double calculateArea();
    public abstract double calculateCircumference();
    public void draw(){
        System.out.println("shape is drawing");
    }

}

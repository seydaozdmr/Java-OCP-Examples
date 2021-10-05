package javaocp.Siniflar.Exceptions.ShapeExample;

import javaocp.Siniflar.Exceptions.NegativeArgumentException;

public class Circle extends Shape{
    private double r;

    //checked exception
    public Circle(double r) throws NegativeArgumentException {
        if(r<0){
            throw new NegativeArgumentException("yarıçap negatif olamaz" , r);
        }
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*r;
    }

    @Override
    public void draw() {
        super.draw();
    }
}

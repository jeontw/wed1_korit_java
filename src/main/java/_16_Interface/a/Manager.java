package _16_Interface.a;

public class Manager {

    public double calcPrice(Shape shape) {
        double a = shape.getArea()*100;
        return a;
    }
}

package _16_Interface.a;

public class Square implements Shape{
    protected int width;
    protected int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

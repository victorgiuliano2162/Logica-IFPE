package nanyang.polymorfism;

public class Rectangle extends Shape {

    protected double width = 1;
    protected double length = 1;


    public Rectangle() {}

    public Rectangle(double width, double length) {}

    public Rectangle(double width, double length, String color, boolean filled) {

    }

    @Override
    public double getArea() {
        return 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

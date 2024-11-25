package nanyang.polymorfism.six.one;

public class Rectangle extends Shape {

    protected double width = 1;
    protected double length = 1;


    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
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
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape" +
                "color='" + color +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                ']';
    }
}

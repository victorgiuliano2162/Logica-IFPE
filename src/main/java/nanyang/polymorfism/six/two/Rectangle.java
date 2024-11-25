package nanyang.polymorfism.six.two;

public class Rectangle implements GeometricObject{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ']';
    }
}

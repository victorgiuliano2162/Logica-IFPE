package nanyang.polymorfism.six.one;

public class Square extends Rectangle{

    protected double side;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square[Shape[" +
                "color='" + color +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                "]]";
    }
}

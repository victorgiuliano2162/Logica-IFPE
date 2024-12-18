package nanyang.polymorfism.six.one;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public void shape() {

    }

    public void shape(String color, boolean filled) {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return getClass().getSimpleName() + " [color=" + color + ", filled=" + filled + "]";
    }

}

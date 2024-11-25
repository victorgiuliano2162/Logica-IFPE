package nanyang.polymorfism.six.eigth;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint( x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "(" + center.x + ", " + center.y + "), speed=(" + center.xSpeed + ", " + center.ySpeed + "), radius=" + radius;
    }

    @Override
    public void moveUp() {
        this.center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += center.xSpeed;
    }
}

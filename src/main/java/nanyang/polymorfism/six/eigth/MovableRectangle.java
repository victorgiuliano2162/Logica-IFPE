package nanyang.polymorfism.six.eigth;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}

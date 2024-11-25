package nanyang.polymorfism.six.five;

public class TesteResizableCircle {
    public static void main(String[] args) {
        ResizableCircle reCircle = new ResizableCircle(5.0);
        System.out.println(reCircle.toString());
        reCircle.resize(200);
        System.out.println(reCircle.toString());
    }
}

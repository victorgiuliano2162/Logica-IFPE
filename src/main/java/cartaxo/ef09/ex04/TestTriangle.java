package cartaxo.ef09.ex04;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        triangle.setLadoA(10.0);

        Triangle triangle2 = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }
}

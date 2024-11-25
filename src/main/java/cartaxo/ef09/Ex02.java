package cartaxo.ef09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Informe a idade da pessoa de número : " + (i + 1));
            idades.add(scanner.nextInt());

        }

        try {
        System.out.println("Qual número você deseja remover da lista?");
        int remover = scanner.nextInt();
        idades.remove(remover);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }
}

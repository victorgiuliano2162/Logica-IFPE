package cartaxo.ef09;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Informe seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Informe um numero: ");
            int numero = scanner.nextInt();

            System.out.println(nome.charAt(numero));

        } catch (Exception e) {
            System.out.println("Posição inválida");
        }


    }
}

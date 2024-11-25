package cartaxo.ef09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String path = scanner.nextLine();
        File arquivo = new File(path.trim() + ".txt");

        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo existente: " + arquivo.getName());
            }
        } catch (IOException e) {
            System.out.println("Caminho inválido");
        }
    }
}

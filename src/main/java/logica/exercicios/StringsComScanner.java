package logica.exercicios;

import java.util.Scanner;

public class StringsComScanner {
    public static void main(String[] args) {
        //Crie duas variáveis
        //A primeira receberá um nome digitado pelo usuário
        //A segunda um sobrenome digitado pelo usuário
        //Imprima-as no console
        Scanner leitor = new Scanner(System.in);
        String nome;
        String sobrenome;


        do {
            System.out.println("Digite seu nome e sobrenome sem espaços em branco");
            nome = leitor.nextLine();
            sobrenome = leitor.nextLine();
        } while(nome.contains(" ") || sobrenome.contains(" "));
    }
}

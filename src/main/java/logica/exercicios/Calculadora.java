package logica.exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        //Desafio
        //Implemente as operações de subtração e multiplicação
        int num1;
        int num2;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite: \n1 -> para adição\n2 -> para subtração\n3 -> para multiplicação");
        String input = leitor.nextLine();


        if(input.equals("1")){
            System.out.println("Digite os dois números que deseja somar");
            num1 = leitor.nextInt();
            num2 = leitor.nextInt();
            System.out.println("A soma entre " + num1 + " e "+ num2 + " é: " +(num1+num2));
        } else if (input.equals("2")) {

        } else if (input.equals("3")) {

        } else {
            while(input.isBlank() || input.isEmpty()) {
                System.out.println("Digite o um valor entre 1 e 3");
                input = leitor.nextLine();
                //Sexta quero que Williams me explique o que acontece aqui
            }
        }
    }
}

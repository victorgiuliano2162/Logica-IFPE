package cartaxo.ef09.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero desejado para sua conta");
        int numero = scanner.nextInt();
        System.out.println("Digite o saldo que depositado na sua conta");
        double saldo = scanner.nextDouble();

        ContaCorrente conta = new ContaCorrente(numero, saldo);

        for (int i = 0; i < 10; i++) {
            double valor = scanner.nextDouble();
            if (valor > conta.getSaldo()) {
                throw new SaldoInsuficienteException("Valor insuficiente");
            } else {
                conta.sacar(valor);
            }

        }
    }
}

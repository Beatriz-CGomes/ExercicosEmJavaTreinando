package aluraExercicios.contaB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ContaB> cB = new ArrayList<>();

        System.out.print("Quantos contas serão cadastradas? ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Entre com dados da conta #" + i + " :");
            System.out.print("Número da conta: ");
            int numeroConta = sc.nextInt();

            System.out.print("Saldo: ");
            double saldo = sc.nextDouble();

            cB.add(new ContaB(numeroConta, saldo));
        }

        System.out.println();
        System.out.println("DADOS DA CONTAS: ");
        for (ContaB conta : cB) {
            System.out.println(conta.getNumeroConta() + ": R$ " + conta.getSaldo());
        }

        System.out.println();
        double soma = 0;
        for (ContaB conta : cB) {
            soma += conta.getSaldo();
        }
        System.out.println("Soma dos saldo de todas as contas: " + soma);

        double media = soma / cB.size();
        System.out.println("Média do saldo de todas as conta: " + media);

        System.out.println();
        ContaB contaMaiorSaldo = cB.get(0);
        for (ContaB conta : cB) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo " + contaMaiorSaldo.getNumeroConta() + ", R$ " + contaMaiorSaldo.getSaldo());

        sc.close();
    }
}

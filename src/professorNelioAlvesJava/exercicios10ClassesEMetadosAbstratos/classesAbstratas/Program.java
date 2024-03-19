package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.classesAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Conta> listaConta = new ArrayList<>();

        listaConta.add(new ContaPoupanca(1002, "Maria", 500.0, 0.02));
        listaConta.add(new ContaCorrente(1003, "Bob", 1000.0, 450.0));
        listaConta.add(new ContaCorrente(1004, "Alex", 2000.0, 550.0));
        listaConta.add(new ContaPoupanca(1005, "Madalena", 900.0, 0.02));


        double soma = 0;
        for (Conta conta : listaConta) {
            soma += conta.getValor();
        }
        System.out.println("Soma " + soma);

        System.out.println();
        for (Conta conta : listaConta) {
            conta.deposito(10);
            System.out.println(conta.getNome() + " = " + conta.getValor());
        }

        System.out.println();
        double soma2 = 0;
        for (Conta conta : listaConta) {
            soma2 += conta.getValor();
        }
        System.out.println("Nova soma acrescentando os 10 " + soma2);

        sc.close();
    }
}

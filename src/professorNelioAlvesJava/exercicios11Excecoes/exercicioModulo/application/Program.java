package professorNelioAlvesJava.exercicios11Excecoes.exercicioModulo.application;

import professorNelioAlvesJava.exercicios11Excecoes.exercicioModulo.DominioException;
import professorNelioAlvesJava.exercicios11Excecoes.exercicioModulo.entities.exceptions.ContaNu;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Número: ");
            int n = sc.nextInt();

            System.out.print("Nome do titular da conta: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Saldo inicial da conta: ");
            double saldo = sc.nextDouble();

            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();

            ContaNu contaNu = new ContaNu(n, nome, saldo, limiteSaque);

            System.out.println();
            System.out.print("Entre com valor a ser sacadao: ");
            double v = sc.nextDouble();
            contaNu.saque(v);

            System.out.println();
            System.out.println(contaNu);
        } catch (DominioException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        sc.close();
    }
}

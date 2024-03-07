package beecrowd;

import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Total de vendas: ");
        double vendas = sc.nextDouble();

        double porceVendas = vendas * 15 / 100;
        double totalSalario = salario + porceVendas;

        System.out.printf("TOTAL DE COMISSÃO: %.2f%n" , porceVendas);
        System.out.printf("TOTAL = R$ %.2f%n" , totalSalario);

        sc.close();
    }
}

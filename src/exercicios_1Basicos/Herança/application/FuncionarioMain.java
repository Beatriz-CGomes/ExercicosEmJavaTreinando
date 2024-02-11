package exercicios_1Basicos.Herança.application;

import exercicios_1Basicos.Herança.model.FuncionarioGerente;
import exercicios_1Basicos.Herança.model.FuncionarioVendedor;

import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Salário: ");
        double salario = sc.nextDouble();

        System.out.println("Digite seu bonus salarial");
        double bonus = sc.nextDouble();

        FuncionarioGerente gerente = new FuncionarioGerente(nome, idade, salario, bonus);
        System.out.println(gerente);
        gerente.calculaSalario();

        System.out.println("*****************************");
        sc.nextLine();

        System.out.println("Nome: ");
        String nome2 = sc.nextLine();

        System.out.println("Idade: ");
        int idade2 = sc.nextInt();

        System.out.println("Salário: ");
        double salario2 = sc.nextDouble();

        System.out.println("Digite o valor da sua venda mensal");
        double vendaDoMes = sc.nextDouble();

        FuncionarioVendedor vendedor = new FuncionarioVendedor(nome2, idade2, salario2, vendaDoMes);
        System.out.println(vendedor);
        vendedor.calculaSalario();


        sc.close();
    }
}

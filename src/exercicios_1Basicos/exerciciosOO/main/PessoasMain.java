package exercicios_1Basicos.exerciciosOO.main;

import exercicios_1Basicos.exerciciosOO.model.Pessoas;

import java.util.Scanner;

public class PessoasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Entre com a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Entre com a sua altura: ");
        double altura = sc.nextDouble();

        Pessoas pessoa = new Pessoas(nome, idade, altura);

        System.out.println("** DADOS **");
        System.out.println(pessoa);
        pessoa.maiorIdade();

        sc.close();
    }
}

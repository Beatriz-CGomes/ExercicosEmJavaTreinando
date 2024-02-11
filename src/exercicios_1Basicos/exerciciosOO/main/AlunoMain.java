package exercicios_1Basicos.exerciciosOO.main;

import exercicios_1Basicos.exerciciosOO.model.Aluno;

import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Matricula: ");
        int matricula = sc.nextInt();

        System.out.println("Primeira nota?: ");
        double nota1 = sc.nextDouble();

        System.out.println("Segunda nota?: ");
        double nota2 = sc.nextDouble();

        System.out.println("Terceira nota?: ");
        double nota3 = sc.nextDouble();

        System.out.println("Quarta nota?: ");
        double nota4 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3, nota4);

        System.out.println(aluno);

        sc.close();


    }

}

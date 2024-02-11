package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Boas-Vindas " + nome);

        sc.close();
    }

}

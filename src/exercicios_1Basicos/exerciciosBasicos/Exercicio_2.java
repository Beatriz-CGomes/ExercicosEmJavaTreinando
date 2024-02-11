package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com primeiro numero inteiro: ");
        int numberOne = sc.nextInt();

        System.out.println("Entre com segundo numero inteiro: ");
        int numberTwo = sc.nextInt();

        int soma = numberOne + numberTwo;

        System.out.println("A soma dos dois números inteiros: " + soma);

        sc.close();

    }
}

package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre um numero inteiro: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " é Par");
        } else {
            System.out.println(number + " é Impar");
        }

        sc.close();

    }
}

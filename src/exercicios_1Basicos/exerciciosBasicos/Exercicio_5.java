package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com primeiro numero inteiro: ");
        int numberInteiro = sc.nextInt();

        System.out.println("Números pares de 0 até " + numberInteiro);
        System.out.println();

        for (int i = 1; i <= numberInteiro; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " par");
            }
        }

        sc.close();

    }
}

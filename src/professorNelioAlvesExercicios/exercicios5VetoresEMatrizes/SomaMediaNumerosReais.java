package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class SomaMediaNumerosReais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numero = sc.nextInt();
        double[] numeroReais = new double[numero];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < numeroReais.length; i++) {
            System.out.print("Digite um numero: ");
            numeroReais[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for (int i = 0; i < numeroReais.length; i++) {
            System.out.print(" " + numeroReais[i]);
        }

        System.out.println();
        for (int i = 0; i < numeroReais.length; i++) {
            soma += numeroReais[i];
        }
        System.out.println("SOMA = " + soma);

        for (int i = 0; i < numeroReais.length; i++) {
            media = soma / numero;
        }
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}

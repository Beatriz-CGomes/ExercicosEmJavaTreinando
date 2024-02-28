package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");
        int numero = sc.nextInt();

        int[] a = new int[numero];
        int[] b = new int[numero];

        System.out.println("Digite os valor do A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valor do B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int soma = 0;
        System.out.println("VALORES RESULTANTES");
        for (int i = 0; i < a.length; i++) {
            soma = a[i] + b[i];
            System.out.println(soma);
        }
        sc.close();
    }
}

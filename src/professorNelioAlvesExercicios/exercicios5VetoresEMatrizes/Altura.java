package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Vetor do  tipo tipo primitivos

        System.out.println("Quantos números serão lidos: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite a altura " + (i + 1));
            vect[i] = sc.nextDouble();
            media += vect[i] / n;
        }

        System.out.printf("AVERAGE HEIGHT: %.2f%n ", media);

        sc.close();
    }
}

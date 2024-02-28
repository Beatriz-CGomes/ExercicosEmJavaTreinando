package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int numero = sc.nextInt();
        int[] vect = new int[numero];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        double cont = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                cont++;
            }
        }

        double soma = 0;
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
            }
        }

        if (cont == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = soma / cont;
            System.out.println("MEDIA DOS PARES = " + media);
        }


        sc.close();
    }
}

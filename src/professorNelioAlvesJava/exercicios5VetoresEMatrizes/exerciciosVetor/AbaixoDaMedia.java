package professorNelioAlvesJava.exercicios5VetoresEMatrizes.exerciciosVetor;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter no vetor? ");
        int numero = sc.nextInt();
        double[] abaixoMedia = new double[numero];

        for (int i = 0; i < abaixoMedia.length; i++) {
            System.out.print("Digite um numero: ");
            abaixoMedia[i] = sc.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < abaixoMedia.length; i++) {
            media += abaixoMedia[i] / numero;
        }

        System.out.println();
        System.out.println("MEDIA DO VALOR: " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA ");
        for (int i = 0; i < abaixoMedia.length; i++) {
            if(abaixoMedia[i] < media){
                System.out.println(abaixoMedia[i]);
            }
        }

        sc.close();
    }
}

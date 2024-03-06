package professorNelioAlvesJava.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numero = sc.nextInt();

        double[] numeroMaior = new double[numero];
        for (int i = 0; i < numeroMaior.length; i++) {
            System.out.print("Digite um numero: ");
            numeroMaior[i] = sc.nextDouble();
        }

        double maiorValor = numeroMaior[0];
        int maiorPosicao = 0;
        for (int i = 0; i < numeroMaior.length; i++) {
            if (numeroMaior[i] > maiorValor) {
                maiorValor = numeroMaior[i];
                maiorPosicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR " + maiorPosicao);

        sc.close();
    }
}

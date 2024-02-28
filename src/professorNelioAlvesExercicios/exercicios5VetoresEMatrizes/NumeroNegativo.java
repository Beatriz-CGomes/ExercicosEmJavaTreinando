package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numero = sc.nextInt();
        int[] numNegativo = new int[numero];
        int cont = 0;

        for (int i = 0; i < numNegativo.length; i++) {
            System.out.print("Digite um número: " + (i + 1));
            numNegativo[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: " );
        for (int i = 0; i < numNegativo.length; i++) {
            if (numNegativo[i] < 0) {
                cont++;
                System.out.println(numNegativo[i]);
            }
        }

        System.out.println("Total negativos digitados: " + cont);
        sc.close();
    }
}

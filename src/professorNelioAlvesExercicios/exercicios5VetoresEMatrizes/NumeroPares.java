package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class NumeroPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numero = sc.nextInt();
        double[] numeroPares = new double[numero];

        for (int i = 0; i < numeroPares.length; i++) {
            System.out.print("Digite um numero: ");
            numeroPares[i] = sc.nextDouble();
        }

        double cont = 0;
        System.out.println("NUMERO PARES: ");
        for (int i = 0; i < numeroPares.length; i++) {
            if (numeroPares[i] % 2 == 0) {
                System.out.print (numeroPares[i] + ", " );
                cont++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + cont);
        sc.close();
    }
}

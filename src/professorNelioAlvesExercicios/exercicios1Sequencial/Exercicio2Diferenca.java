package professorNelioAlvesExercicios.exercicios1Sequencial;

import java.util.Scanner;

public class Exercicio2Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra com primeiro número: ");
        int A = sc.nextInt();

        System.out.println("Entra com segundo número: ");
        int B = sc.nextInt();

        System.out.println("Entra com terceiro número: ");
        int C = sc.nextInt();

        System.out.println("Entra com quarto número: ");
        int D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENÇA =  " + diferenca);

        sc.close();

    }
}

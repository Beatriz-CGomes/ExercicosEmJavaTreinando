package professorNelioAlvesJava.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class MatrizExercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor para M: ");
        int m = sc.nextInt();
        System.out.println("Valor para N: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valor para X: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                }
                if (j > 0) {
                    System.out.println("Left: " + mat[i][j]);
                }
                if (i > 0) {
                    System.out.println("Up: " + mat[i - 1][j]);
                }
                if (j < mat[i].length - 1) {
                    System.out.println("Right: " + mat[i][j + 1]);
                }
                if (i < mat.length - 1) {
                    System.out.println("Down: " + mat[i + 1][j]);
                }
            }
        }


        sc.close();
    }
}

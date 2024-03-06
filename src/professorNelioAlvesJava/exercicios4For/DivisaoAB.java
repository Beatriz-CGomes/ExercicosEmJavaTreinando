package professorNelioAlvesJava.exercicios4For;

import java.util.Scanner;

public class DivisaoAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero:  ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print("A: ");
            double A = sc.nextDouble();

            System.out.print("B: ");
            double B = sc.nextDouble();

            if (B == 0) {
                System.out.println("divisao impossivel");
            } else {
                double sum = A / B;
                System.out.println(sum);
            }
        }

        sc.close();
    }
}

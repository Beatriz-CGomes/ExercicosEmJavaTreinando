package professorNelioAlvesJava.exercicios4For;

import java.util.Scanner;

public class PesoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas serao lidas: ");
        int notas = sc.nextInt();

        for (int i = 0; i <notas; i++) {
            System.out.println("Digite a nota A: ");
            double A = sc.nextDouble();

            System.out.println("Digite a nota B: ");
            double B = sc.nextDouble();

            System.out.println("Digite a nota C: ");
            double C = sc.nextDouble();

            double  somaNotas = (A * 2 + B * 3 + C * 5 ) / 10;
            System.out.printf("Média %.1f%n" , somaNotas);
        }
        sc.close();
    }
}

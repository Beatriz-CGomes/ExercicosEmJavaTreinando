package professorNelioAlvesJava.exercicios3While;

import java.util.Scanner;

public class Exercicio1Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida!");
            System.out.println();
            senha = sc.nextInt();
        }
        System.out.println("Senha Invalida!");

        sc.close();
    }
}

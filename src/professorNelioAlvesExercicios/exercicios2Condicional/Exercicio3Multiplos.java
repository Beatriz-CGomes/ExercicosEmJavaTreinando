package professorNelioAlvesExercicios.exercicios2Condicional;

import java.util.Scanner;

public class Exercicio3Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int a = sc.nextInt();

        System.out.println("Valor 2: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}

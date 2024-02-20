package professorNelioAlvesExercicios.exercicios2Condicional;

import java.util.Scanner;

public class Exercicio1NumeroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra com um numero");
        int numA = sc.nextInt();

        if (numA >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }


        sc.close();
    }
}

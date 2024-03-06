package professorNelioAlvesJava.exercicios1Sequencial;

import java.util.Scanner;

public class Exercicio1Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma;

        System.out.println("Entra com primeiro número: ");
        int A = sc.nextInt();

        System.out.println("Entra com segundo número: ");
        int B = sc.nextInt();


        soma = A + B;

        System.out.println("SOMA = " + soma);


        sc.close();
    }
}

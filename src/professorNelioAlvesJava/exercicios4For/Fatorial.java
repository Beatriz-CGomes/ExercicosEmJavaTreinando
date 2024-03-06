package professorNelioAlvesJava.exercicios4For;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero = ");
        int numero = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial do " + numero + " é " + fatorial);

        sc.close();
    }
}

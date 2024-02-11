package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase");
        String frase = sc.nextLine();

        int numerosDeCaracteres = frase.length();

        System.out.println("O número de caracteres da frease é " + numerosDeCaracteres);

        sc.close();

    }
}

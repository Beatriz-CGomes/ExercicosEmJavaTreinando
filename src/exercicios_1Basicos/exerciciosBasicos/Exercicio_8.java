package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("A Palavra " + palavra + " invertida é: " + palavraInvertida);
        System.out.println();
        System.out.println("Total de caracteres da palavra são " + palavra.length() + " letras");

        sc.close();

    }
}

package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String palavra = "a";
        String novaPalavra = "*";

        String novaFrase = frase.replaceAll(palavra, novaPalavra);

        System.out.println("Orignal: " + frase);
        System.out.println("Trocada: " + novaFrase);

        sc.close();

    }
}

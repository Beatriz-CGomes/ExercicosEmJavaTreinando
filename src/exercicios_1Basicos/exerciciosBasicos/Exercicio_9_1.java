package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String fraseComVogaisSubstituidas = substituirVogais(frase);

        System.out.println("Frase com vogais substituídas: " + fraseComVogaisSubstituidas);

        scanner.close();
    }

    public static String substituirVogais(String frase) {
        // Substitui todas as vogais (maiúsculas e minúsculas) por '*'
        frase = frase.replaceAll("[aeiouAEIOU]", "*");
        return frase;
    }
}

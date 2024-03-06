package professorNelioAlvesJava.exercicios4For;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero = ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            int nLinhas = i;
            int nQuadrado = i * i;
            int nCubo = i * i * i;

            System.out.println("***************************");
            System.out.println("Linhas: " + nLinhas);
            System.out.println("Quadrado: " + nQuadrado);
            System.out.println("Cubo: " + nCubo);
        }

        sc.close();
    }
}

package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        int numberr = sc.nextInt();

        if (numberr > 0) {
            System.out.println(numberr + " Positivo");
        } else if (numberr == 0) {
            System.out.println(numberr + " É zero");
        } else {
            System.out.println(numberr + " Negativo");
        }

        sc.close();

    }
}

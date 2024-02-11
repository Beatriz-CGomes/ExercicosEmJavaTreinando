package exercicios_1Basicos.exerciciosBasicos;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        int numbeer = sc.nextInt();

        System.out.println("Tabuada do: " + numbeer);
        for (int i = 0; i <= 10; i++) {
            int calculo = numbeer * i;
            System.out.println(i + " x " + numbeer + " = " + calculo);
        }

        sc.close();

    }
}

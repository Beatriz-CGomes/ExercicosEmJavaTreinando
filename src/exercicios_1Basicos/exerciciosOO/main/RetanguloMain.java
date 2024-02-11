package exercicios_1Basicos.exerciciosOO.main;

import exercicios_1Basicos.exerciciosOO.model.Retangulo;

import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Alura: ");
        double altura = sc.nextDouble();

        System.out.println("Largura: ");
        double largura = sc.nextDouble();

        Retangulo ret = new Retangulo(altura, largura);

        System.out.println();
        System.out.println(ret);
        sc.close();
    }
}

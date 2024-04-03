package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.generics.exercicioComObject.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.generics.exercicioComObject.service.PrintService2;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService2 ps = new PrintService2();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        //ele vai deixar aceitar todo tipo de objeto
        //problema com segurança e tipo
        ps.addValue("Maria");

        for (int i = 1; i <= n; i++) {
            System.out.print("Numbers: " + i + ": ");
            int numbers = sc.nextInt();
            ps.addValue(numbers);
        }

        ps.print();
        //aqui ele nao permite converter inteiro para obejto é necessário criar um casting
        Integer x =(Integer) ps.first();
        System.out.println("First: " + ps.first());


        sc.close();

    }
}

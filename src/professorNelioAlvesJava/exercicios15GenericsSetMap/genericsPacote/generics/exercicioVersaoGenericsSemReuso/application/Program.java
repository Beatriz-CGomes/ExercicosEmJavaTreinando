package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.generics.exercicioVersaoGenericsSemReuso.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.generics.exercicioVersaoGenericsSemReuso.service.PrintService;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Numbers: " + i + ": ");
            int numbers = sc.nextInt();
            ps.addValue(numbers);
        }

        ps.print();
        System.out.println("First: " + ps.first());


        sc.close();

    }
}

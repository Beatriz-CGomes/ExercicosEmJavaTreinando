package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.generics.exercicioUsandoGenericsReuso.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.generics.exercicioUsandoGenericsReuso.service.PrintService3;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //aqui estamos instanciando com tipo da classe e podemos ter o reuso e o tipo seguro
        PrintService3<Integer> ps = new PrintService3<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Numbers: " + i + ": ");
            Integer numbers = sc.nextInt();
            ps.addValue(numbers);
        }

        ps.print();
        System.out.println("First: " + ps.first());


        sc.close();

    }
}

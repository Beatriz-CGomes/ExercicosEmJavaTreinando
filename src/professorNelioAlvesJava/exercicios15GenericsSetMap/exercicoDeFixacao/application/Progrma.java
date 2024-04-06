package professorNelioAlvesJava.exercicios15GenericsSetMap.exercicoDeFixacao.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Progrma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int numero = 0;

        System.out.println("Quantos estudantes do curso A: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            numero = sc.nextInt();
            a.add(numero);
        }

        System.out.println("Quantos estudantes do curso B: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            numero = sc.nextInt();
            b.add(numero);
        }

        System.out.println("Quantos estudantes do curso C: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            numero = sc.nextInt();
            c.add(numero);
        }


        Set<Integer> soma = new HashSet<>();
        soma.addAll(a);
        soma.addAll(b);
        soma.addAll(c);

        System.out.println("Total estudantes: " + soma.size());

        sc.close();
    }
}

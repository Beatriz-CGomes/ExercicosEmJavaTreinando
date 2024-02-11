package exercicios_1Basicos.Herança.application;

import exercicios_1Basicos.Herança.model.Animal;
import exercicios_1Basicos.Herança.model.AnimalCachorro;
import exercicios_1Basicos.Herança.model.AnimalGato;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** CACHORRO **");
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Raça:");
        String raca = sc.nextLine();
        sc.nextLine();

        System.out.println("Cachorro está bravo? ");
        char bravo = sc.next().charAt(0);

        AnimalCachorro cachorro = new AnimalCachorro(nome, idade, raca, bravo);
        System.out.println(cachorro);
        cachorro.emitirSom();
        cachorro.bravo(bravo);

        System.out.println("*************************");
        System.out.println("** GATO **");
        System.out.println("Nome: ");
        String nome2 = sc.nextLine();
        sc.nextLine();

        System.out.println("Idade: ");
        int idade2 = sc.nextInt();

        System.out.println("Raça:");
        String raca2 = sc.nextLine();
        sc.nextLine();

        System.out.println("O gato está roendo movies? ");
        char roer = sc.next().charAt(0);

        AnimalGato gato = new AnimalGato(nome2, idade2, raca2, roer);
        System.out.println(gato);
        gato.emitirSom();
        gato.roendoMovies(roer);


        sc.close();
    }
}

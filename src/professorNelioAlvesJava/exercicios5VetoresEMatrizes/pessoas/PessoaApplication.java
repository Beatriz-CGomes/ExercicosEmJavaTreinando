package professorNelioAlvesJava.exercicios5VetoresEMatrizes.pessoas;

import java.util.Scanner;

public class PessoaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão cadastradas? ");
        int numP = sc.nextInt();

        Pessoa[] p = new Pessoa[numP];

        for (int i = 0; i < p.length; i++) {
            System.out.print("Nome: " + (i + 1) + " ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: " + (i + 1) + " ");
            int idade = sc.nextInt();

            System.out.print("Altura: " + (i + 1) + " ");
            double altura = sc.nextDouble();

            p[i] = new Pessoa(nome, idade, altura);
        }

        double media = 0;
        for (int i = 0; i < p.length; i++) {
            media += p[i].getAltura() / numP;
        }
        System.out.println();
        System.out.printf("Altura média %.2f%n ", media);

        double cont = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getIdade() < 16) {
                cont++;
            }
        }

        double porce = porce = cont * 100 / numP;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porce);

        for (int i = 0; i < p.length; i++) {
            if (p[i].getIdade() < 16) {
                System.out.println(p[i].getNome());
            }
        }

        sc.close();
    }
}

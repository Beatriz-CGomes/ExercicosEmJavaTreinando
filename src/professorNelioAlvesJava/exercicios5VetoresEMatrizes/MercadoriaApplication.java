package professorNelioAlvesJava.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class MercadoriaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Vetor de tipo referencia que se trata de uma classe(OBEJTO)

        System.out.println("Quantos produtos serão cadastrado");
        int num = sc.nextInt();
        Mercadoria[] mer = new Mercadoria[num];

        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.println("Nome: " + (i + 1));
            String nome = sc.nextLine();

            System.out.println("Preço: " + (i + 1));
            double preco = sc.nextDouble();
            mer[i] = new Mercadoria(nome, preco);
        }

        double media = 0;
        for (int i = 0; i < num; i++) {
            media += mer[i].getPreco() / num;
        }

        System.out.printf("MÉDIA DO PREÇO %.2f%n ", media);


        sc.close();
    }
}

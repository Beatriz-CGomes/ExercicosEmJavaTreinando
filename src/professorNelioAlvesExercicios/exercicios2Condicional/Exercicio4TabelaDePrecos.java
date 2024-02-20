package professorNelioAlvesExercicios.exercicios2Condicional;

import java.util.Scanner;

public class Exercicio4TabelaDePrecos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma;

        System.out.println("\tTABELA DE PREÇOS");
        System.out.println("\t");
        System.out.println("\t1 - Cachorro Quente R$ 4,00  ");
        System.out.println("\t2 - X-Salada R$ 4,50  ");
        System.out.println("\t3 - X-Bacon R$ 5,00  ");
        System.out.println("\t4 - Torrada Simples R$ 2,00  ");
        System.out.println("\t5 - Refrigerante R$ 1,50  ");
        System.out.println("\t");
        System.out.println("\tEntra com uma opção");
        int opcao = sc.nextInt();

        System.out.println("Entra com a quantidade");
        int quantidade = sc.nextInt();


        switch (opcao) {
            case 1:
                soma = 4.00 * quantidade;
                System.out.println("Total: R$ " + soma);
                break;

            case 2:
                soma = 4.50 * quantidade;
                System.out.println("Total: R$ " + soma);
                break;

            case 3:
                soma = 5.00 * quantidade;
                System.out.println("Total: R$ " + soma);
                break;

            case 4:
                soma = 2.00 * quantidade;
                System.out.println("Total: R$ " + soma);
                break;

            case 5:
                soma = 1.50 * quantidade;
                System.out.println("Total: R$ " + soma);
                break;

            default:
                System.out.println("Opção Invalida!");
        }

        sc.close();
    }
}

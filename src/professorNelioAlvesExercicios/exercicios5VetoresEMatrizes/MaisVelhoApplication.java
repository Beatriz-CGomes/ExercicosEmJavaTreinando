package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

import java.util.Scanner;

public class MaisVelhoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos pessoas você vai digitar? ");
        int num = sc.nextInt();
        MaisVelho[] pessoa = new MaisVelho[num];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            pessoa[i] = new MaisVelho(nome, idade);
        }

        int maiorIdade = pessoa[0].getIdade();
        int posicao = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() > maiorIdade) {
                maiorIdade = pessoa[i].getIdade();
                posicao = i;
            }
        }

       System.out.println("PESSOA MAIS VELHA: " + pessoa[posicao].getNome());


        sc.close();
    }
}

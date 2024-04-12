package professorNelioAlvesJava.exercicios5VetoresEMatrizes.aprovado;

import java.util.Scanner;

public class AprovadoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão cadastrados? ");
        int num = sc.nextInt();
        Aprovado[] alunoAprovado = new Aprovado[num];

        for (int i = 0; i < alunoAprovado.length; i++) {
            System.out.println("Dados da " + (i + 1) + " aluno: ");
            System.out.println("Nome: ");
            sc.nextLine();
            String nomeAluno = sc.nextLine();

            System.out.println("Primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.println("Segunda nota:  ");
            double nota2 = sc.nextDouble();

            alunoAprovado[i] = new Aprovado(nomeAluno, nota1, nota2);
        }


        System.out.println("Alunos Aprovados");
        for (int i = 0; i < alunoAprovado.length; i++) {
            double somaMedia = (alunoAprovado[i].getNota1() + alunoAprovado[i].getNota2()) / 2;
            if (somaMedia >= 6.0){
                System.out.println(alunoAprovado[i].getNomeAluno());
                System.out.println(somaMedia);
            }
        }

        sc.close();
    }
}

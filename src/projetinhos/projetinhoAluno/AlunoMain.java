package projetinhos.projetinhoAluno;

import exercicios_1Basicos.exerciciosOO.model.Aluno;

import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastrarAluno cadastro = new CadastrarAluno();

        int opcao;


        do {
            System.out.println("\t-------------------------------");
            System.out.println("\t");
            System.out.println("\tSISTEMA DE ALUNOS ");
            System.out.println("\t");
            System.out.println("   1 - Adcinionar Aluno   ");
            System.out.println("   2 - Remover Aluno   ");
            System.out.println("   3 - Buscar Aluno   ");
            System.out.println("   4 - Exibir Aluno   ");
            System.out.println("   5 - Sair   ");
            System.out.println("\t");
            System.out.println("\t");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite os dados do aluno ");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Matricula: ");
                    String matricula = sc.nextLine();
                    // sc.nextLine();

                    System.out.println("Curso: ");
                    String curso = sc.nextLine();

                    Alunos aluno = new Alunos(nome, idade, matricula, curso);
                    cadastro.adicionarAluno(aluno);
                    System.out.println("Aluno adicionado com sucesso");
                    break;

                case 2:
                    System.out.println("Digite a matricula que deseja ser removida: ");
                    matricula = sc.nextLine();
                    sc.nextLine();

                    Alunos removaAluno = cadastro.buscarAluno(matricula);
                    if (removaAluno != null) {
                        cadastro.removerAluno(removaAluno);
                        System.out.println("Aluno removido com sucesso");
                    } else {
                        System.out.println("Aluno não se encontra em nosso banco");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da matricula que você deseja buscar: ");
                    matricula = sc.nextLine();
                    sc.nextLine();

                    Alunos encontraAluno = cadastro.buscarAluno(matricula);
                    if (encontraAluno != null) {
                        System.out.println("Aluno encontrado ");
                        System.out.println("Nome: " + encontraAluno.getNome());
                        System.out.println("Idade: " + encontraAluno.getIdade());
                        System.out.println("Matricula: " + encontraAluno.getMatricula());
                        System.out.println("Curso: " + encontraAluno.getCurso());
                    } else {
                        System.out.println("Aluno não cadastrado em nossa escola ");
                    }
                    break;

                case 4:
                    System.out.println("Lista dos alunos cadastrados: ");
                    cadastro.exibirAluno();
                    break;

                case 5:
                    System.out.println("Volte sempre");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Invalida!");
            }
        } while (opcao != 5);
    }
}

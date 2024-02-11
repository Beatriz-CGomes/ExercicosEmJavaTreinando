package exercicios_1Basicos.exerciciosOO.main;

import exercicios_1Basicos.exerciciosOO.model.Livro;

import java.util.Scanner;

public class LivroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Titulo do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Autor do livro: ");
        String autor = sc.nextLine();

        System.out.println("Ano de publicação");
        int ano = sc.nextInt();

        Livro livro = new Livro(titulo, autor, ano);

        System.out.println("Você já leu o livro?  (s/n)");
        char response = sc.next().charAt(0);
        livro.devolverLivro(response);

        System.out.println("Você quer emprestar o livro? (s/n)");
        char responsee = sc.next().charAt(0);
        livro.emprestarLivro(responsee, response);

        System.out.println("** INFORMAÇÕES DO LIVRO **");
        System.out.println(livro);
        System.out.println(livro.devolverLivro(response));
        System.out.println(livro.emprestarLivro(responsee, response));

        sc.close();

    }
}

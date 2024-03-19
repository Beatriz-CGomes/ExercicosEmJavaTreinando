package aluraExercicios.produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> pr = new ArrayList<>();

        System.out.print("Quantos produtos serão cadastrados no sistema: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o produto #" + (i + 1) + " :");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double p = sc.nextDouble();

            pr.add(new Produto(nome, p));
        }

        System.out.println();
        System.out.println("Produtos:");
        for (Produto p : pr) {
            System.out.println(p.getNome() + ": R$ " + p.getPreco());
        }

        System.out.println();
        double soma = 0;
        for (Produto p : pr) {
            soma += p.getPreco();
        }
        System.out.println("Preço total dos produtos cadastrados: " + soma);

        sc.close();
    }
}

package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com a quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto # " + (i + 1) + "data: ");
            System.out.print("Escolha o tipo de produto (I - importado/ U - Usado - C - Comum)");
            char resposta = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (resposta == 'i' || resposta == 'I') {
                System.out.print("Custo da importação: ");
                double custoI = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, custoI));
            } else if (resposta == 'u' || resposta == 'U') {
                System.out.print("Data de uso: (DD/MM/YY) ");
                Date date = sdf.parse(sc.next());
                list.add(new ProdutoUsado(nome, preco, date));
            } else {
                list.add(new Produto(nome, preco));

            }

        }


        System.out.println("Preço dos produtos: ");
        for (Produto lista : list) {
            System.out.println(lista.precoEtiqueta());
        }

        sc.close();
    }
}

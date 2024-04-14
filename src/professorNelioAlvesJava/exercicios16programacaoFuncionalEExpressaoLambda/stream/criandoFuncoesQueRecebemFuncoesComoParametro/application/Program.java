package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.stream.criandoFuncoesQueRecebemFuncoesComoParametro.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.stream.criandoFuncoesQueRecebemFuncoesComoParametro.entites.ProdutoProdutos;
import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.stream.criandoFuncoesQueRecebemFuncoesComoParametro.service.ProdutoProdutosService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        //criar uma funcao que receba outra funcao como argumento
        //Fazer um programa que, a partir de uma lista de produtos, calcule a
        //soma dos preços somente dos produtos cujo nome começa com "T"

        List<ProdutoProdutos> list = new ArrayList<>();

        list.add(new ProdutoProdutos("Tv", 900.00));
        list.add(new ProdutoProdutos("Mouse", 50.00));
        list.add(new ProdutoProdutos("Tablet", 350.50));
        list.add(new ProdutoProdutos("HD Case", 80.90));

        ProdutoProdutosService ps = new ProdutoProdutosService();

        //filtrando a soma
        double soma = ps.filtroSoma(list, p -> p.getNome().charAt(0) == 'T');
        System.out.println("Soma = " + String.format("%.2f", soma));

        System.out.println();
        //mostrando o filtro pelo nome começando com a LETRA M
        ps.filtrarNomeL(list, p -> p.getNome().charAt(0) == 'M');
        System.out.println();


    }
}

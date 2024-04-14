package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.stream.criandoFuncoesQueRecebemFuncoesComoParametro.service;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.stream.criandoFuncoesQueRecebemFuncoesComoParametro.entites.ProdutoProdutos;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoProdutosService {

    //receber o valor no parametro da condução e colocar no if
    public double filtroSoma(List<ProdutoProdutos> list, Predicate<ProdutoProdutos> criterioComparacao) {
        double soma = 0.0;
        for (ProdutoProdutos p : list) {
            if (criterioComparacao.test(p)) {
                soma += p.getPreco();
            }
        }

        return soma;
    }


    public void filtrarNomeL(List<ProdutoProdutos> list, Predicate<ProdutoProdutos> criterioComparacao) {
        for (ProdutoProdutos p : list) {
            if (criterioComparacao.test(p)) {
                System.out.println(p);
            }
        }
    }
}
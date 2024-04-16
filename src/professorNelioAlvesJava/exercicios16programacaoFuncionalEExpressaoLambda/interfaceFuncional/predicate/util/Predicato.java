package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.util;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.entities.ProdutosPPredicate;

import java.util.function.Predicate;

public class Predicato implements Predicate<ProdutosPPredicate> {


    @Override
    public boolean test(ProdutosPPredicate p) {
        return p.getPreco() >= 100.0;
    }
}

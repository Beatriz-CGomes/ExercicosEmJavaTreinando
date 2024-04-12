package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.util;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.entities.ProdutoPredicate;

import java.util.function.Predicate;

public class Predicato implements Predicate<ProdutoPredicate> {


    @Override
    public boolean test(ProdutoPredicate p) {
        return p.getPreco() >= 100.0;
    }
}

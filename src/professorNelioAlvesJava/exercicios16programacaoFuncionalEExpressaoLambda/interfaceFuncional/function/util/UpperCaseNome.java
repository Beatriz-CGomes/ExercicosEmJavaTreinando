package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.function.util;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.function.entities.ProdutoFunction;

import java.util.function.Function;

public class UpperCaseNome implements Function<ProdutoFunction, String> {

    @Override
    public String apply(ProdutoFunction p) {
        return p.getNome().toUpperCase();
    }
}

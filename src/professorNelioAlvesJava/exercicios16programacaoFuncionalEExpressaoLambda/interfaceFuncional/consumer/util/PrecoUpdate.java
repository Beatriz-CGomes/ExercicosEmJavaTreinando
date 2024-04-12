package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.util;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.entities.ProdutoCostumer;

import java.util.function.Consumer;

public class PrecoUpdate implements Consumer<ProdutoCostumer> {

    @Override
    public void accept(ProdutoCostumer p) {
        p.setPreco(p.getPreco() * 1.1);
    }
}

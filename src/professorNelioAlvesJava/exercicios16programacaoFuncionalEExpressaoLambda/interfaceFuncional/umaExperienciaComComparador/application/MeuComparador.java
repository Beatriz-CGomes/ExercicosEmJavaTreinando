package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.entities.ProdutoComparador;

import java.util.Comparator;

public class MeuComparador implements Comparator<ProdutoComparador> {

    @Override
    public int compare(ProdutoComparador p1, ProdutoComparador p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
}

package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.entities.ProdutoCComparador;

import java.util.Comparator;

public class MeuCComparador implements Comparator<ProdutoCComparador> {

    @Override
    public int compare(ProdutoCComparador p1, ProdutoCComparador p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
}

package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioDeFixacao.service;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioDeFixacao.entities.FuncFunc;

import java.util.List;
import java.util.function.Predicate;

public class FuncFuncService {

    public double filtroSoma(List<FuncFunc> list, Predicate<FuncFunc> criterio) {
        double soma = 0.0;
        for (FuncFunc func : list) {
            if (criterio.test(func)) {
                soma += func.getSalary();
            }
        }

        return soma;
    }


}

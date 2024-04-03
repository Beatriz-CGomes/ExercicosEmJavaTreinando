package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.genericsDelimitados.service;

import java.util.List;

public class CalculationService {

    //essa declaração está dizendo que o metado vai trabalhar com qualquer tipo T desde que o
    //tipo T seja qualquer subtipo de Comparable<T>
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

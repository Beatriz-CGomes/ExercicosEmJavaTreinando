package professorNelioAlvesJava.exercicios15GenericsSetMap.set.comoTreeSetComparaElementos.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.set.comoTreeSetComparaElementos.entities.ProductTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {


        Set<ProductTreeSet> set = new TreeSet<>();

        set.add(new ProductTreeSet("Tv", 900.0));
        set.add(new ProductTreeSet("Notebook", 1900.0));
        set.add(new ProductTreeSet("Tablet", 400.0));


        for (ProductTreeSet p : set) {
            System.out.println(p);
        }


        //O TreeSet compara pela implementação da interface Comparable e do metado compareTo

    }
}

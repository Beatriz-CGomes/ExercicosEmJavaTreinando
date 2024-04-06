package professorNelioAlvesJava.exercicios15GenericsSetMap.set.setTeorico;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeorico1 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //Sobre HashSET<>();
        //ele não retorna pela posição
        //retorna true pois existe esse elemento no conjunto
        //se a ordem não importa o HashSet é indicado
        System.out.println(set.contains("Notebook"));

        //O TreeSet<>();
        //colocou a lista ordenada

        //o LinkedHashSet<>();
        //ordena de forma que elas foram inseridas

        //operações importantes
        //set.remove("Tv");
        //removendo por uma condição todas que possuem elementos maior ou igual a 3
        // set.removeIf(x -> x.length() >=3);

        //removendo todo mundo que tenha a primeira letra T
        //isso é um predicado: x ->
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println();
        for (String s : set) {
            System.out.println(s);
        }


    }
}

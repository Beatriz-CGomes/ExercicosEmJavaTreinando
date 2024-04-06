package professorNelioAlvesJava.exercicios15GenericsSetMap.set.setTeorico;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetTeorico2 {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        //usando um constutor especial que está colocando c como copia do a
        // está fazendo a união do conjuento c com b
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);


        //intersection
        //pegando somente os elementos em comum
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);


        //difference
        //removendo os duplicados e mostrando apenas os diferentes
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}

package professorNelioAlvesExercicios.teoria2lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTeoria {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Jorge");

        System.out.println(list.size());

        for (String listNome : list) {
            System.out.println(listNome);
        }


        System.out.println("----------------------------");
        list.remove(2);
        list.removeIf(listNome -> listNome.charAt(0) == 'M');
        for (String listNome : list) {
            System.out.println(listNome);
        }


        System.out.println("----------------------------");
        list.indexOf(2);
        System.out.println(list.indexOf("Ana"));
        System.out.println(list.indexOf("Jorge"));

        System.out.println("----------------------------");
        //filtrar a lista somente quem começa com A
        List<String> result = list.stream().filter(listNome -> listNome.charAt(0) == 'A').collect(Collectors.toList());
        for (String listNome : result) {
            System.out.println(listNome);
        }

        System.out.println("----------------------------");
        //encontrando a primeira pessoa com nome A
        String name = list.stream().filter(listNome -> listNome.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}

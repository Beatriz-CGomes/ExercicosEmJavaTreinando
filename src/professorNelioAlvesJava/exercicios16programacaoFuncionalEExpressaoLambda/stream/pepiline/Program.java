package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.stream.pepiline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //reduce - pega o elemento inicial e depois uma finção com dois argumentos
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                //.filter - filtra a lista
                .filter(x -> x % 2 == 0)
                //map - transforma em outra stream
                .map(x -> x * 10)
                //coolect - para tranformar em uma lista
                .collect(Collectors.toList());

        //list também tem a operação toArray
        System.out.println(Arrays.toString(newList.toArray()));


    }
}

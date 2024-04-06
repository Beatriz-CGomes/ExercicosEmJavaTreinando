package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.covariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        //isso é convariancia é permitido acessar mas não inserir/adicionar
        Number x = list.get(0);
        
        //list.add(20); //erro de compilação
    }
}

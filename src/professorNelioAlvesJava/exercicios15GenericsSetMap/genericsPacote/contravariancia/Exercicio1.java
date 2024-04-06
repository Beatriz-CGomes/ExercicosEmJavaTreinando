package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        //uma lista de objetos
        List<Object> myObjets = new ArrayList<>();
        myObjets.add("Maria");
        myObjets.add("Alex");

        //uma lista generica que consegue ter acesso a qualquer tipo super de numeros ou qualquer supertipo de numbers
        List<? super Number> myNums = myObjets;

        //consegue adicionar
        myNums.add(10);
        myNums.add(3.14);

        //mas não conseguimos acessar
        //Number x = myNums.get(0); //erro de compilação
    }
}

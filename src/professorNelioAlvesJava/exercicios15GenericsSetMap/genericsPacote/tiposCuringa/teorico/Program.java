package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.tiposCuringa.teorico;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //List<Object> não é o supertipo de qualquer tipo de lista:

        List<Object> myObject = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        // myObject = myNumbers; //erro de compilação

        //diferente dessa explicacao
        Object objt;
        Integer x = 10;
        objt = x;

        System.out.println("************************************************");
        //O supertipo de qualquer lista é List<?>. Este é um tipo curinga
        List<?> myObj = new ArrayList<>();
        List<Integer> myNumbers2 = new ArrayList<>();
        myObj = myNumbers2;

    }
}

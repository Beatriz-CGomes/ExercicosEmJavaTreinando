package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.contravariancia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        //criar uma função copia que recebe uma lista mas e mais especifica e copia a lista para uma mais generica
        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    //tem que receber um tipo de lista mais especifica - ? indica que é qualquer tipo extends o tipo Number
    //lista de destino é mais generica - estamos usando uma lista objeto
    //origem - List<? extends Number: origem (lista espefica) - Convariancia - podemos acessar os elementos
    //destino - List<? super Number>: destino (lista generica) - Contravariancia - podemos adicionar/inserir elementos na lista

    public static void copy(List<? extends Number> origem, List<? super Number> destino) {
        for (Number numero : origem) {
            destino.add(numero);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }


}

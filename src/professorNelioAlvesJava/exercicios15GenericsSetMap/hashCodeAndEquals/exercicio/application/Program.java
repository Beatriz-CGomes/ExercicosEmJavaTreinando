package professorNelioAlvesJava.exercicios15GenericsSetMap.hashCodeAndEquals.exercicio.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.hashCodeAndEquals.exercicio.entties.HashCodeEqualsClient;

public class Program {
    public static void main(String[] args) {

        HashCodeEqualsClient c1 = new HashCodeEqualsClient("Maria", "maria@gmail.com");
        HashCodeEqualsClient c2 = new HashCodeEqualsClient("Bob", "bob@gmail.com");
        HashCodeEqualsClient c3 = new HashCodeEqualsClient("Maria", "maria@gmail.com");

        //aqui vai dar verdadeiro pois nao criamos um novo objeto, esta alocado a mesma referencia na memoria, para gerar falso
        // é necessario c palavra new para se criar um novo objeto

        String s1 = "Test";
        String s2 = "Test";

        System.out.println();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        //false
        System.out.println(c1.equals(c2));

        //true
        System.out.println(c1.equals(c3));


        //aqui ele esta comparando a referencia da memoria (sao dois objetos diferentes) posicao de memoria diferntes
        System.out.println(c1 == c3);
    }
}

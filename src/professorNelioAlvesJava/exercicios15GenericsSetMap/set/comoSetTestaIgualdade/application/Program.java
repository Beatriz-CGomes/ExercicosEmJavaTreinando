package professorNelioAlvesJava.exercicios15GenericsSetMap.set.comoSetTestaIgualdade.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.set.comoSetTestaIgualdade.entities.ProductsSet;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {


        Set<ProductsSet> set = new HashSet<>();

        set.add(new ProductsSet("Tv", 900.0));
        set.add(new ProductsSet("Notebook", 1900.0));
        set.add(new ProductsSet("Tablet", 400.0));

        ProductsSet productsSet = new ProductsSet("Notebook", 1900.0);

        //aqui vai gerar um falso mesmo ele estando no conjunto pq a classe não tem hasCode e equals gerada na classe ProductsSet
        //então ele vai jogar a referencia pelo ponteiro e vai gerar falso pq terão dois objetos

        //gerando HashCode na classe vai gerar true pq vai comprar pelos valores e não por ponteiro
        System.out.println(set.contains(productsSet));

    }
}

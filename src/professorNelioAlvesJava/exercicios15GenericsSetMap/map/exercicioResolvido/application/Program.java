package professorNelioAlvesJava.exercicios15GenericsSetMap.map.exercicioResolvido.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.map.exercicioResolvido.entities.ProductsMap;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<ProductsMap, Double> stock = new HashMap<>();

        ProductsMap p1 = new ProductsMap("Tv", 900.0);
        ProductsMap p2 = new ProductsMap("Notebook", 1900.0);
        ProductsMap p3 = new ProductsMap("Tablet", 500.0);

        stock.put(p1, 2000.0);
        stock.put(p2, 2500.0);
        stock.put(p3, 1500.0);

        ProductsMap ps = new ProductsMap("Tv", 900.0);


        //true pq contem essa informação no conjunto
        System.out.println("Contains 'ps' keys: " + stock.containsKey(ps));


    }
}

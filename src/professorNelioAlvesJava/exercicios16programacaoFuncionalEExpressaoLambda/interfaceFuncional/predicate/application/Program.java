package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.entities.ProdutoPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<ProdutoPredicate> list = new ArrayList<>();

        list.add(new ProdutoPredicate("TV", 900.0));
        list.add(new ProdutoPredicate("Mouse", 50.0));
        list.add(new ProdutoPredicate("Tablet", 400.0));
        list.add(new ProdutoPredicate("HD Case", 80.90));

        //remover todos os produtos igual ou mais de 100 reais

        //com a classe predicato
        //list.removeIf(new Predicato());

        //com Reference methodo com metado estatico
        list.removeIf(ProdutoPredicate::staticProdutoPredicate);

        //com Reference methodo sem o  metado estatico
        list.removeIf(ProdutoPredicate::noStaticProdutoPredicate);

        //expresso lambda declarada
        Predicate<ProdutoPredicate> pred = p -> p.getPreco() >= 100.0;

        //expressao lambda declarada
        list.removeIf(p -> p.getPreco() >= 100.0);

        for (ProdutoPredicate p : list) {
            System.out.println(p);
        }
    }
}

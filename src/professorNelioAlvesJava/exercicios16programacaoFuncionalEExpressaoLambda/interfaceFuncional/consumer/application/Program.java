package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.entities.ProdutoSCostumer;
import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<ProdutoSCostumer> list = new ArrayList<>();

        list.add(new ProdutoSCostumer("TV", 900.0));
        list.add(new ProdutoSCostumer("Mouse", 50.0));
        list.add(new ProdutoSCostumer("Tablet", 400.0));
        list.add(new ProdutoSCostumer("HD Case", 80.90));

        //aumetar a lista de dos valores do produtos em 10%

        //implementação da interface
        list.forEach(new PriceUpdate());

        //Reference methodo com metados estaticos
        list.forEach(ProdutoSCostumer::staticPrecoUpdate);

        //Reference method com metados nao estaticos
        list.forEach(ProdutoSCostumer::noStaticPrecoUpdate);

        //expressao lambada declarada
        Consumer<ProdutoSCostumer> prodC = c -> c.setPreco(c.getPreco() * 1.1);
        list.forEach(prodC);

        //expressao lambda inline
        list.forEach(c -> c.setPreco(c.getPreco() * 1.1));

        //imprimindo na tela com nosso forEach
        list.forEach(System.out::println);

    }
}

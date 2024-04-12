package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.entities.ProdutoCostumer;
import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.util.PrecoUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<ProdutoCostumer> list = new ArrayList<>();

        list.add(new ProdutoCostumer("TV", 900.0));
        list.add(new ProdutoCostumer("Mouse", 50.0));
        list.add(new ProdutoCostumer("Tablet", 400.0));
        list.add(new ProdutoCostumer("HD Case", 80.90));

        //aumetar a lista de dos valores do produtos em 10%

        //implementação da interface
        list.forEach(new PrecoUpdate());

        //Reference methodo com metados estaticos
        list.forEach(ProdutoCostumer::staticPrecoUpdate);

        //Reference method com metados nao estaticos
        list.forEach(ProdutoCostumer::noStaticPrecoUpdate);

        //expressao lambada declarada
        Consumer<ProdutoCostumer> prodC = c -> c.setPreco(c.getPreco() * 1.1);
        list.forEach(prodC);

        //expressao lambda inline
        list.forEach(c -> c.setPreco(c.getPreco() * 1.1));

        //imprimindo na tela com nosso forEach
        list.forEach(System.out::println);

    }
}

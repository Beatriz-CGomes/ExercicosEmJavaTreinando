package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.function.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.function.entities.ProdutoFunction;
import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.function.util.UpperCaseNome;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {


        List<ProdutoFunction> list = new ArrayList<>();

        list.add(new ProdutoFunction("Tv", 900.0));
        list.add(new ProdutoFunction("Mouse", 50.0));
        list.add(new ProdutoFunction("Tablet", 350.50));
        list.add(new ProdutoFunction("HD Case", 90.0));

        //Implementação da interface
        List<String> nomes = list.stream().map(new UpperCaseNome()).collect(Collectors.toList()); //converter essa stream de novo para lista

        //Reference method com método estático
        list.stream().map(ProdutoFunction::staticUpdateNome).collect(Collectors.toList());

        //Reference method com método não estático
        list.stream().map(ProdutoFunction::noStaticUpdateNome).collect(Collectors.toList());

        //Expressão lambda declarada
        Function<ProdutoFunction, String> pS = p -> p.getNome().toUpperCase();
        list.stream().map(pS).collect(Collectors.toList());

        //Expressão lambda inline
        list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());


        //para mostrar na tela
        nomes.forEach(System.out::println);


    }
}

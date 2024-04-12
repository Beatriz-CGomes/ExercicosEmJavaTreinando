package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.application;

import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.entities.ProdutoComparador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<ProdutoComparador> list = new ArrayList<>();

        list.add(new ProdutoComparador("TV", 900.0));
        list.add(new ProdutoComparador("Mouse", 50.0));
        list.add(new ProdutoComparador("Tablet", 400.0));
        list.add(new ProdutoComparador("HD Case", 80.90));

        //mandando ordernar minha lista usando collection.sort
        //para usar o collections.sort precisa que a lista seja uma implementação comparable (na classe produtocomparador)
        //Collections.sort(list);   //assim que usamos

        //esse modo é melhor para usar termos de comparação
        list.sort(new MeuComparador());

        //outra forma de se fazer como o primeiro
        //assim de forma anonima
        Comparator<ProdutoComparador> comp = new Comparator<ProdutoComparador>() {

            //isso é uma classe anonima
            @Override
            public int compare(ProdutoComparador p1, ProdutoComparador p2) {
                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
            }
        };


        //deixando o codigo de cima mais limpo
        //isso é uma funcao anonima
        // errow function
        //deixando sem chaves e sem a palavra return pois tem apenas uma linha
        Comparator<ProdutoComparador> comp2 = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        list.sort(comp2);


        //deixando o codigo mais limpo ainda
        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        //mostrando os produtos na tela
        System.out.println("Produtos");
        for (ProdutoComparador c : list) {
            System.out.println(c);
        }

    }
}

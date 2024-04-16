package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.application;


import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.entities.ProdutoCComparador;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<ProdutoCComparador> list = new ArrayList<>();

        list.add(new ProdutoCComparador("TV", 900.0));
        list.add(new ProdutoCComparador("Mouse", 50.0));
        list.add(new ProdutoCComparador("Tablet", 400.0));
        list.add(new ProdutoCComparador("HD Case", 80.90));

        //mandando ordernar minha lista usando collection.sort
        //para usar o collections.sort precisa que a lista seja uma implementação comparable (na classe produtocomparador)
        //Collections.sort(list);   //assim que usamos

        //esse modo é melhor para usar termos de comparação
        list.sort(new MeuCComparador());

        //outra forma de se fazer como o primeiro
        //assim de forma anonima
        Comparator<ProdutoCComparador> comp = new Comparator<ProdutoCComparador>() {

            //isso é uma classe anonima
            @Override
            public int compare(ProdutoCComparador p1, ProdutoCComparador p2) {
                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
            }
        };


        //deixando o codigo de cima mais limpo
        //isso é uma funcao anonima
        // errow function
        //deixando sem chaves e sem a palavra return pois tem apenas uma linha
        Comparator<ProdutoCComparador> comp2 = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        list.sort(comp2);


        //deixando o codigo mais limpo ainda
        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        //mostrando os produtos na tela
        System.out.println("Produtos");
        for (ProdutoCComparador c : list) {
            System.out.println(c);
        }

    }
}

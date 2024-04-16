package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioResolvido.application;


import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioResolvido.entities.Pproductss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Pproductss> ps = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                ps.add(new Pproductss(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }


            //aqui consigo a media da soma de todos os produtos da lista
            double media = ps.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / ps.size();


            System.out.println("Avarege price: " + String.format("%.2f", media));


            //mostrar o nome dos produtos cujo o preço é menor do que a soma da media
            //mostrar eles de forma descrecente


            //comparator vai ser uma função que compra duas streams
            //queremos comparar por ordem alfabetica
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = ps.stream().filter(p -> p.getPrice() < media).map(p -> p.getName())
                    //ordendando de forma descrencete
                    .sorted(comp.reversed())
                    //aqui transformando a stream em lista
                    .collect(Collectors.toList());


            System.out.println();
            names.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}

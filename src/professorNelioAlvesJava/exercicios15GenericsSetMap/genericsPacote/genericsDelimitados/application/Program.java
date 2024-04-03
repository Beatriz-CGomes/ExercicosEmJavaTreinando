package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.genericsDelimitados.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.genericsDelimitados.entities.ProductGenerics;
import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.genericsDelimitados.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        List<ProductGenerics> list = new ArrayList<>();
        Locale.setDefault(Locale.US);

        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            //lendo uma linha do arquivo
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new ProductGenerics(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            ProductGenerics x = CalculationService.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

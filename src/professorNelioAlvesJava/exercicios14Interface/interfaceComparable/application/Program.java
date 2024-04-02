package professorNelioAlvesJava.exercicios14Interface.interfaceComparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //instanciando uma lista de string
        List<String> list = new ArrayList<>();

        //definindo o caminho do arquivo
        String path = "C:\\temp\\in.txt";

        //aqui está lendo o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //lendo uma linha do arquivo
            String name = br.readLine();

            //enquanto a varival name for diferente de nulo, ele entra na lista e add mais um nome
            while (name != null) {

                //ele entra na lista e add mais um nome
                list.add(name);

                //depois ler a proxima linha
                name = br.readLine();
            }

            //operacao padrao para ordenar uma coleção
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }

            //tratamento da excecao
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

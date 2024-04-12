package professorNelioAlvesJava.exercicios15GenericsSetMap.map.exercicioDeFixacao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //HashSet veio por ordem alfabetica
        //LinkedHashMap veio por ordem de votacao
        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.print("Digite o caminho: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                int qVotos = Integer.parseInt(fields[1]);

                if (votos.containsKey(nome)) {
                    int total = votos.get(nome);
                    votos.put(nome, qVotos + total);

                } else {
                    votos.put(nome, qVotos);
                }
                line = br.readLine();
            }
            System.out.println();


            for (String s : votos.keySet()) {
                System.out.println(s + " " + votos.get(s));
            }

        } catch (
                IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}

package professorNelioAlvesJava.exercicios15GenericsSetMap.exercicioResolvido.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.exercicioResolvido.entities.EntradaLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        //aqui já vai ler e abrir o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //escolhendo o HashSet pq ele é mais rapido e nao importa a ordem
            Set<EntradaLog> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String nomeUsuario = fields[0];
                Date momento = Date.from(Instant.parse(fields[1]));

                //estrutura de dados set que vai brecar a duplicidade
                set.add(new EntradaLog(nomeUsuario, momento));

                line = br.readLine();
            }
            System.out.println("Total usuario: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

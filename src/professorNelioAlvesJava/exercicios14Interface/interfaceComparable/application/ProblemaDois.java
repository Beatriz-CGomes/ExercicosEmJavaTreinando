package professorNelioAlvesJava.exercicios14Interface.interfaceComparable.application;

import professorNelioAlvesJava.exercicios14Interface.interfaceComparable.entities.Funcionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemaDois {
    public static void main(String[] args) {


        List<Funcionarios> list = new ArrayList<>();
        String path = "C:\\temp\\in2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String funcionariosCsv = br.readLine();
            while (funcionariosCsv != null) {
                String[] fields = funcionariosCsv.split(",");
                list.add(new Funcionarios(fields[0], Double.parseDouble(fields[1])));
                funcionariosCsv = br.readLine();
            }

            Collections.sort(list);
            for (Funcionarios fun : list) {
                System.out.println(fun.getNome() + ", " + fun.getSalario());
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}

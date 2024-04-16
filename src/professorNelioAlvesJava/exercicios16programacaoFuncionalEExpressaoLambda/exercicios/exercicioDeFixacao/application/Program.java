package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioDeFixacao.application;


import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioDeFixacao.entities.FuncFunc;
import professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioDeFixacao.service.FuncFuncService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<FuncFunc> func = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                func.add(new FuncFunc(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            FuncFuncService funcs = new FuncFuncService();

            //email das pessoas com salario acima do valor do salario digitado
            List<String> email = func.stream()
                    .filter(f -> f.getSalary() >= salary)
                    .map(f -> f.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            email.forEach(System.out::println);


            //soma do salario das pessoas com a letra 'M'
            double soma = funcs.filtroSoma(func, f -> f.getName().charAt(0) == 'M');
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", soma));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}

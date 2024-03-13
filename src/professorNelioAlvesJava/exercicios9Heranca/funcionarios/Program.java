package professorNelioAlvesJava.exercicios9Heranca.funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o numero de funcionarios ");
        int numero = sc.nextInt();

        List<Funcionarios> list = new ArrayList<>();


        for (int i = 0; i < numero; i++) {
            System.out.print("Funcionario # " + (i + 1) + " data: ");
            System.out.print("Funcionario é tercerizado? (s/n) ");
            char res = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Horas: ");
            int horas = sc.nextInt();

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (res == 's' || res == 'S') {
                System.out.print("Adicional: ");
                double add = sc.nextDouble();
                list.add(new FuncionariosTerceiros(nome, horas, valorPorHora, add));

            } else {
                list.add(new Funcionarios(nome, horas, valorPorHora));
            }
        }

        System.out.println(list);


        sc.close();
    }
}

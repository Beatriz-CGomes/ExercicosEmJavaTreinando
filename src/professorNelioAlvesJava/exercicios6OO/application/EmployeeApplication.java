package professorNelioAlvesJava.exercicios6OO.application;

import professorNelioAlvesJava.exercicios6OO.entitites.Employee;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross Salary: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee em = new Employee(name, grossSalary, tax);
        System.out.println(em);

        System.out.print("Which percentage to increase salary: ");
        double porcentage = sc.nextDouble();
        em.increaseSalary(porcentage);
        System.out.println(em);
        sc.close();
    }
}

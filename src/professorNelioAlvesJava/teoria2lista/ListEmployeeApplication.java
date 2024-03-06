package professorNelioAlvesJava.teoria2lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employyes will be registred? ");
        int numero = sc.nextInt();
        int[] totalNumero = new int[numero];

        List<ListEmployee> emp = new ArrayList<>();

        for (int i = 0; i < totalNumero.length; i++) {
            System.out.println();
            System.out.println("Emplooye # " + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            ListEmployee employee = new ListEmployee(id, name, salary);
            emp.add(employee);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        Integer idToIncreaseSalary = sc.nextInt();

        System.out.println("Enter the percentage: ");
        Double porcetage = sc.nextDouble();

        boolean found = false;

        //lista encrementando o salario
        for (ListEmployee employee : emp) {
            if (employee.getId().equals(idToIncreaseSalary)) {
                employee.increaseSalry(porcetage);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This id does not exist");
        }

        //lista completa
        System.out.println();
        System.out.println("List of employees");
        for (ListEmployee employee : emp) {
            System.out.println(employee);
        }


        sc.close();
    }
}

package professorNelioAlvesJava.exercicios8Enumeracao.composicao.worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class WorkerMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i + 1) + ":");
            System.out.print("Date: (DD/mm/yyyy) ");
            Date contactDate = sdf.parse(sc.next());

            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract hourContract = new HourContract(contactDate, valuePerHour, hours);
            worker.addContract(hourContract);

        }

        System.out.println();
        System.out.println("Enter month and year to calculte income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println(worker);
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));



        sc.close();
    }
}

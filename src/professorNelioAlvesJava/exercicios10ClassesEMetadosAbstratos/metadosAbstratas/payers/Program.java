package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.metadosAbstratas.payers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char response = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anula income: ");
            double aI = sc.nextDouble();

            if (response == 'i' || response == 'I') {
                System.out.print("Healt expenditure: ");
                double h = sc.nextDouble();

                taxPayerList.add(new Individual(name, aI, h));
            } else {
                System.out.print("Number of employees: ");
                int nE = sc.nextInt();

                taxPayerList.add(new Company(name, aI, nE));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer t : taxPayerList) {
            System.out.println(t.getName() + ": R$ " + String.format("%.2f", t.tax()));
        }


        System.out.println();
        double sum = 0;
        for (TaxPayer t : taxPayerList) {
            sum += t.tax();
        }
        System.out.println("TOTAL TAXES R$ " + String.format("%.2f", sum));


        sc.close();
    }
}

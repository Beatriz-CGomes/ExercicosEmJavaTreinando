package professorNelioAlvesJava.exercicios14Interface.defaultMethods.exercicio.application;

import professorNelioAlvesJava.exercicios14Interface.defaultMethods.exercicio.service.BrazilInterestService;
import professorNelioAlvesJava.exercicios14Interface.defaultMethods.exercicio.service.InterestService;
import professorNelioAlvesJava.exercicios14Interface.defaultMethods.exercicio.service.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        //BrazilInterestService brazilInterestService = new BrazilInterestService(2.0);
        //double payment = brazilInterestService.payment(amount, months);

        InterestService usaInterestService = new UsaInterestService(1.0);
        double payment = usaInterestService.payment(amount, months);

        System.out.println("Payment after " + months + " months ");
        System.out.println(String.format("%.2f", payment));
        sc.close();
    }
}

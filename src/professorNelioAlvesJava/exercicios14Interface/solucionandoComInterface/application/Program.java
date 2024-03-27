package professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.application;

import professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.entities.CarRental1;
import professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.entities.Vehicle1;
import professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.service.BrazilTaxService1;
import professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.service.RentalService1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String modelCar = sc.nextLine();

        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        //passando uma instanciação de um veiculo pois no contrutor do carRental o que está lá é um tipo de veiculo e não string
        CarRental1 carRental1 = new CarRental1(start, finish, new Vehicle1(modelCar));

        System.out.print("Enter price per hour: ");
        double hour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double day = sc.nextDouble();
        RentalService1 rentalService = new RentalService1(hour, day, new BrazilTaxService1());
        rentalService.processingInvoice(carRental1);

        System.out.println();
        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", carRental1.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental1.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental1.getInvoice().getTotalPayment()));


        sc.close();
    }
}

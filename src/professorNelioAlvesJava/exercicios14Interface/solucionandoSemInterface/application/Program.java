package professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.application;

import professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.entitites.CarRental;
import professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.entitites.Vehicle;
import professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.service.BrazilTaxService;
import professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.service.RentalService;

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
        CarRental carRental = new CarRental(start, finish, new Vehicle(modelCar));

        System.out.print("Enter price per hour: ");
        double hour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double day = sc.nextDouble();
        RentalService rentalService = new RentalService(hour, day, new BrazilTaxService());
        rentalService.processingInvoice(carRental);

        System.out.println();
        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));


        sc.close();
    }
}

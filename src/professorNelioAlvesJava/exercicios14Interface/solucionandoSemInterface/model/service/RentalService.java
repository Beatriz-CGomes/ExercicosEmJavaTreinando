package professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.service;

import professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.entitites.CarRental;
import professorNelioAlvesJava.exercicios14Interface.solucionandoSemInterface.model.entitites.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;


    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public void processingInvoice(CarRental carRental) {
        //pegando a duração em minutos
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        //dividindo por 60 para se tornar horas
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12) {
            //Math.ceil(hours) essa função está arredondando o número para cima
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            //dividindo por 24 para pegar as horas em dias
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        //aqui calculamos o imposto
        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}

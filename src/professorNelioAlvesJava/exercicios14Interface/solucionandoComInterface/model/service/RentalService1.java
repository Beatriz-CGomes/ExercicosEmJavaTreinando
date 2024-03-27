package professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.service;

import professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.entities.CarRental1;
import professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.entities.Invoice1;

import java.time.Duration;

public class RentalService1 {

    private Double pricePerHour;
    private Double pricePerDay;


    private TaxService taxService;

    public RentalService1(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processingInvoice(CarRental1 carRental1) {
        //pegando a duração em minutos
        double minutes = Duration.between(carRental1.getStart(), carRental1.getFinish()).toMinutes();
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
        double tax = taxService.tax(basicPayment);

        carRental1.setInvoice(new Invoice1(basicPayment, tax));
    }
}

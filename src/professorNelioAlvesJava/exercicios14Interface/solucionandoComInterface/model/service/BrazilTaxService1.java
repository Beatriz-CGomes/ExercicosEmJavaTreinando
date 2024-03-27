package professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.service;

public class BrazilTaxService1 implements TaxService{

    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.20;
        } else {
            return amount * 0.15;
        }
    }
}

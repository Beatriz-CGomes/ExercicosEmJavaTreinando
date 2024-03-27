package professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.entities;

public class Invoice1 {

    private Double basicPayment;
    private Double tax;

    public Invoice1() {
    }

    public Invoice1(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}

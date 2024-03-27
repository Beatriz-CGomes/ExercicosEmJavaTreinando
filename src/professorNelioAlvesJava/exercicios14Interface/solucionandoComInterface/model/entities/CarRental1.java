package professorNelioAlvesJava.exercicios14Interface.solucionandoComInterface.model.entities;

import java.time.LocalDateTime;

public class CarRental1 {

    private LocalDateTime start;
    private LocalDateTime finish;

    //ambos tem uma associação com essa classe
    private Vehicle1 vehicle;
    private Invoice1 invoice;

    public CarRental1() {
    }

    public CarRental1(LocalDateTime start, LocalDateTime finish, Vehicle1 vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public CarRental1(LocalDateTime start, LocalDateTime finish, Vehicle1 vehicle, Invoice1 invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle1 getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle1 vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice1 getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice1 invoice) {
        this.invoice = invoice;
    }
}

package professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.service;

public interface OnlinePaymentService {

    double PaymentFee(double amount);

    double interest(double amount, int months);
}

package professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.service;

public class PaypalService implements OnlinePaymentService {


    @Override
    public double PaymentFee(double amount) {
        //O juro de 2%
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        //Juros de 1% sobre as parcelas mensais
        return amount * 0.0 * months;
    }
}

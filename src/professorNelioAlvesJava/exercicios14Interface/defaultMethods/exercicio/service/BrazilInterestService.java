package professorNelioAlvesJava.exercicios14Interface.defaultMethods.exercicio.service;

public class BrazilInterestService implements InterestService {

    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}

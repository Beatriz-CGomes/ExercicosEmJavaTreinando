package professorNelioAlvesJava.exercicios14Interface.defaultMethods.exercicio.service;


public class UsaInterestService implements InterestService {

    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}

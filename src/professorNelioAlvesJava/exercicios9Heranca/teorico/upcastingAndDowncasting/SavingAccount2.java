package professorNelioAlvesJava.exercicios9Heranca.teorico.upcastingAndDowncasting;

public class SavingAccount2 extends Account2 {

    private Double interestRate;

    public SavingAccount2() {
        super();
    }

    public SavingAccount2(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount2(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }


    public void updateBlance() {
        balance += balance * interestRate;
    }
}

package professorNelioAlvesJava.exercicios9Heranca.teorico.polimorfismo;

public class BussinessAccount4 extends Account4 {

    private Double loanLimit;

    public BussinessAccount4() {
    }

    public BussinessAccount4(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BussinessAccount4(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}

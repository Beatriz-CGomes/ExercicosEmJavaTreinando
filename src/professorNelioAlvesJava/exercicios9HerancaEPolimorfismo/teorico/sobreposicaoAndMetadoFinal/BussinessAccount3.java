package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.teorico.sobreposicaoAndMetadoFinal;

public class BussinessAccount3 extends Account3 {

    private Double loanLimit;

    public BussinessAccount3() {
    }

    public BussinessAccount3(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BussinessAccount3(Integer number, String holder, Double balance, Double loanLimit) {
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

package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.teorico.upcastingAndDowncasting;

public class BussinessAccount2 extends Account2 {

    private Double loanLimit;

    public BussinessAccount2() {
    }

    public BussinessAccount2(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BussinessAccount2(Integer number, String holder, Double balance, Double loanLimit) {
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
}

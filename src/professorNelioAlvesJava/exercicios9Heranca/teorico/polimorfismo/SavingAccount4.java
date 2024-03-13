package professorNelioAlvesJava.exercicios9Heranca.teorico.polimorfismo;

//se colocar a palavra final antes da class não permite que essa classe seja herdada por outra
public class SavingAccount4 extends Account4 {

    private Double interestRate;

    public SavingAccount4() {
        super();
    }

    public SavingAccount4(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount4(Integer number, String holder, Double balance, Double interestRate) {
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

    //palavra final em metados não permite que o metado seja herdado por outra classe
    //Isso é uma sobreposição de metado
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

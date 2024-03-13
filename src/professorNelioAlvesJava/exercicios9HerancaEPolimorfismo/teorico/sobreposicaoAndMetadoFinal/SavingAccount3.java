package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.teorico.sobreposicaoAndMetadoFinal;

//se colocar a palavra final antes da class não permite que essa classe seja herdada por outra
public class SavingAccount3 extends Account3 {

    private Double interestRate;

    public SavingAccount3() {
        super();
    }

    public SavingAccount3(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount3(Integer number, String holder, Double balance, Double interestRate) {
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
    public final void withdraw(double amount) {
        balance -= amount;
    }
}

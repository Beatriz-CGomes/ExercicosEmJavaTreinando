package professorNelioAlvesExercicios.exercicios6OO.entitites;

public class Account {

    private int accountNumber;
    private String holder;
    private double balance;

    public Account() {

    }

    public Account(int accountNumber, String holder, double initialValue) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialValue);
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double deposit) {
        return balance += deposit;
    }

    public double withdraw(double withdraw) {
        return balance -= (withdraw + 5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account " + getAccountNumber() + ", Holder " + getHolder() + " Balance R$ " + getBalance());

        return sb.toString();
    }
}

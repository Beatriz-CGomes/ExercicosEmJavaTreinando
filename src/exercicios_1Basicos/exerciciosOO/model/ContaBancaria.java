package exercicios_1Basicos.exerciciosOO.model;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String titulr, int numeroConta, double saldo) {
        this.titular = titulr;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposito(double deposito) {
        double de = saldo + deposito;
        return de;
    }

    public double saque(double saque) {
        if (saque > saldo) {
            double somaSaque = saldo - saque;
            return somaSaque;
        } else if (saldo == saque) {
            return 0;
        } else {
            double somaSaque = saldo - saque;
            return somaSaque;
        }
    }

    @Override
    public String toString() {
        return "** DADOS DA CONTA ** \n" +
                "Titular: " + titular + "\n" +
                "Número da Conta: " + numeroConta + "\n" +
                "Saldo R$ " + saldo;
    }
}

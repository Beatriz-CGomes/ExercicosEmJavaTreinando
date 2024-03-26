package professorNelioAlvesJava.exercicios11Excecoes.exercicioModulo.entities.exceptions;

import professorNelioAlvesJava.exercicios11Excecoes.exercicioModulo.DominioException;

public class ContaNu {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public ContaNu() {
    }

    public ContaNu(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void deposito(double valor) {
        saldo += valor;
    }


    public void saque(double valor) {
        if (valor > limiteSaque) {
            throw new DominioException("Erro de Saque: A quantia excede o limite do saque");
        }
        if (saldo == 0 || valor > saldo) {
            throw new DominioException("Erro de Saque: Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Novo Saldo: R$ " + getSaldo());
        return sb.toString();
    }
}

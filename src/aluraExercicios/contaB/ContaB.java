package aluraExercicios.contaB;

public class ContaB {

    private Integer numeroConta;
    private Double saldo;

    public ContaB() {
    }

    public ContaB(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

}

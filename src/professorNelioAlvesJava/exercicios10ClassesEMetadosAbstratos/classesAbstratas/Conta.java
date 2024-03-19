package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.classesAbstratas;

public abstract class Conta {

    private Integer numero;
    private String nome;
    protected Double valor;

    public Conta() {
    }

    public Conta(Integer numero, String nome, Double valor) {
        this.numero = numero;
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public double saque(double v) {
        return valor -= v;
    }

    public double deposito(double v) {
        return valor += v;
    }
}

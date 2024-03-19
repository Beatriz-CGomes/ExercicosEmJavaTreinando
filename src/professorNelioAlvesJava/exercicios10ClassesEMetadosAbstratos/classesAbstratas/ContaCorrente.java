package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.classesAbstratas;

public class ContaCorrente extends Conta {

    private Double limiteEmprestimo;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaCorrente(Integer numero, String nome, Double valor, Double limiteEmprestimo) {
        super(numero, nome, valor);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void limite(double v) {
        if (v <= limiteEmprestimo) {
            valor += v - 10.0;
        }
    }

}

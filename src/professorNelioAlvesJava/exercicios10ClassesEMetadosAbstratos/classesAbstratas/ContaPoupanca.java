package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.classesAbstratas;

public class ContaPoupanca extends Conta{

    private double porce;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(double porce) {
        this.porce = porce;
    }

    public ContaPoupanca(Integer numero, String nome, Double valor, double porce) {
        super(numero, nome, valor);
        this.porce = porce;
    }

    public double getPorce() {
        return porce;
    }

    public void setPorce(double porce) {
        this.porce = porce;
    }

    public void updateValor(){
        valor += valor * porce;
    }
}

package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.funcionarios;

public class FuncionariosTerceiros extends Funcionarios {

    private Double adicional;

    public FuncionariosTerceiros() {
        super();
    }

    public FuncionariosTerceiros(Double adicional) {
        this.adicional = adicional;
    }

    public FuncionariosTerceiros(String nome, Integer horas, Double valorPorHora, Double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + adicional * 1.1;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getNome() + " - R$ " + pagamento());
        return sb.toString();
    }
}

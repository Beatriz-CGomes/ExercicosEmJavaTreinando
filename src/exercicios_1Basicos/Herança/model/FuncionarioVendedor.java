package exercicios_1Basicos.Herança.model;

public class FuncionarioVendedor extends  Funcionario{

    private double vendasDoMes;
    private double porcentagem = 0.04;

    public FuncionarioVendedor(String nome, int idade, double salario, double vendasDoMes) {
        super(nome, idade, salario);
        this.vendasDoMes = vendasDoMes;
    }

    public double getVendasDoMes() {
        return vendasDoMes;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    @Override
    public double calculaSalario() {
        double soma = vendasDoMes * porcentagem;
        return getSalario() + soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("VENDEDOR -" + "\n");
        sb.append("Nome: " + getNome() + "\n");
        sb.append("Idade: " + getIdade() + "\n");
        sb.append("Salário: " + calculaSalario());
        return sb.toString();
    }
}

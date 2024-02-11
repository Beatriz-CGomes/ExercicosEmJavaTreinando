package exercicios_1Basicos.Herança.model;

public class FuncionarioGerente extends Funcionario{

    private double bonusSalarial;

    public FuncionarioGerente(String nome, int idade, double salario, double bonusSalarial) {
        super(nome, idade, salario);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    @Override
    public double calculaSalario() {
        return getSalario() +bonusSalarial;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("GERENTE -" + "\n");
        sb.append("Nome: " + getNome() + "\n");
        sb.append("Idade: " + getIdade() + "\n");
        sb.append("Salário: " + calculaSalario());
        return sb.toString();
    }
}

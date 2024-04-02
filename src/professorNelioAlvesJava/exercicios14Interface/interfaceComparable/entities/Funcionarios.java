package professorNelioAlvesJava.exercicios14Interface.interfaceComparable.entities;

public class Funcionarios implements Comparable<Funcionarios>{

    private String nome;
    private Double salario;

    public Funcionarios(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionarios other) {
        return nome.compareTo(other.getNome());
        //para comparar por salario
        //salario.compareTo(other.getSalario());
        //colocando o - menos na frente fica de forma descrente
    }
}

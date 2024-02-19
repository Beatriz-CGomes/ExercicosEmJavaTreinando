package projetinhos.projetinhoAluno;

public class Alunos {

    private String nome;
    private int idade;
    private String matricula;
    private String curso;

    public Alunos() {
    }

    public Alunos(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getNome() + "\n");
        sb.append("Matrciula: " + getMatricula() + "\n");
        sb.append("Curso: " + getCurso() + "\n");
        sb.append("Idade: " + getIdade() + "\n");
        return sb.toString();
    }
}
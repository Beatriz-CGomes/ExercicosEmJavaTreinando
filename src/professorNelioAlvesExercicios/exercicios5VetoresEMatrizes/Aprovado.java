package professorNelioAlvesExercicios.exercicios5VetoresEMatrizes;

public class Aprovado {

    private String nomeAluno;
    private double nota1;
    private double nota2;

    public Aprovado(String nomeAluno, double nota1, double nota2) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }


    public double getNota2() {
        return nota2;
    }

}

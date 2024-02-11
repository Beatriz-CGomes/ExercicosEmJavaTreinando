package exercicios_1Basicos.exerciciosOO.model;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno() {
    }

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public double mediaNotas() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 6.0) {
            return media;
        } else if (media >= 5.0 && media < 6) {
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            return media;
        } else {
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            return media;
        }
    }

    public String exibeMsg(){
        if(mediaNotas() >= 6){
            return "Parabéns você passou";
        } else if(mediaNotas() >= 5 && mediaNotas() < 6){
            return "Você está de recuperação";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Nome estudante: "+ nome + "\n");
        sb.append("Matricula: " + matricula + "\n");
        sb.append("Média: " + mediaNotas() + "\n");
        sb.append(exibeMsg());
        return sb.toString();
    }
}

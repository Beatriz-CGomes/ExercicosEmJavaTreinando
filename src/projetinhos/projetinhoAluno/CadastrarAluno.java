package projetinhos.projetinhoAluno;

import java.util.ArrayList;

public class CadastrarAluno {

    ArrayList<Alunos> alunos = new ArrayList<>();

    public CadastrarAluno() {
    }

    public CadastrarAluno(ArrayList<Alunos> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Alunos> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        alunos.remove(aluno);
    }

    public Alunos buscarAluno(String matricula) {
        for (Alunos aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }

        return null;
    }

    public void exibirAluno() {
        for (Alunos aluno : alunos) {
            System.out.println();
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Curso: " + aluno.getCurso());
        }
    }
}

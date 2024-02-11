package exercicios_1Basicos.exerciciosOO.model;

public class Livro {

    private String titulo;
    private String autor;
    private int ano;

    public Livro() {
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String devolverLivro(char response) {
        if (response == 'S' || response == 's') {
            return "Devolver livro";
        } else {
            return "Não devolver livro";
        }
    }

    public String emprestarLivro(char responsee, char response) {
        if (responsee == 's'  && response == 's') {
            return "Emprestar livro";
        } else {
            return "não emprestar livro";
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titutlo: " + titulo + "\n");
        sb.append("Autor: " + autor + "\n");
        sb.append("Ano: " + ano + "\n");
        return sb.toString();
    }

}

package exercicios_1Basicos.exerciciosOO.model;

public class Pessoas {

    private String nome;
    private int idade;
    private double altura;

    public Pessoas() {
    }

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void maiorIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else if (idade < 18 && idade >= 15) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Criança");
        }
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "idade: " + idade + "\n" +
                "altura: " + altura;
    }
}

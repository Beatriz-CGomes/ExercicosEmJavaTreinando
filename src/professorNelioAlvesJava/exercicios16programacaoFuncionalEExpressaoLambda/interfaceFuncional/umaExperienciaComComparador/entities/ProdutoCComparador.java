package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.umaExperienciaComComparador.entities;

public class ProdutoCComparador {

    private String nome;
    private Double preco;

    public ProdutoCComparador(){

    }
    public ProdutoCComparador(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getNome() + ", R$ " + getPreco());
        return sb.toString();
    }
}

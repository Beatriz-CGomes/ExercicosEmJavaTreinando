package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.consumer.entities;

public class ProdutoSCostumer {

    private String nome;
    private Double preco;

    public ProdutoSCostumer() {

    }

    public ProdutoSCostumer(String nome, Double preco) {
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

    //essa é uma forma de  se refazer com Reference com metado estatico ao inves da gente criar a classe Predicate
    public static void staticPrecoUpdate(ProdutoSCostumer c) {
        c.setPreco(c.getPreco() * 1.1);
    }

    //referene method com metados nãoo estatico
    public void noStaticPrecoUpdate() {
        setPreco(getPreco() * 1.1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getNome() + ", R$ " + String.format("%.2f", getPreco()));
        return sb.toString();
    }
}

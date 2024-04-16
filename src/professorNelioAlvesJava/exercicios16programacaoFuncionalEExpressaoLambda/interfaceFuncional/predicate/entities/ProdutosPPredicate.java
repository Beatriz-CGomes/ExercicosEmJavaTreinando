package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.predicate.entities;

public class ProdutosPPredicate {

    private String nome;
    private Double preco;

    public ProdutosPPredicate() {

    }

    public ProdutosPPredicate(String nome, Double preco) {
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
    public static boolean staticProdutoPredicate(ProdutosPPredicate p) {
        return p.getPreco() >= 100.0;
    }

    //referene method com metados nãoo estatico
    public boolean noStaticProdutoPredicate() {
        return getPreco() >= 100.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getNome() + ", R$ " + getPreco());
        return sb.toString();
    }
}

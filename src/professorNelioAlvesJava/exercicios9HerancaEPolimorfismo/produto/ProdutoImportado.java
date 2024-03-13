package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.produto;

public class ProdutoImportado extends Produto {

    private Double custoAdicional;

    public ProdutoImportado() {
    }

    public ProdutoImportado(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    public ProdutoImportado(String nome, Double preco, Double custoAdicional) {
        super(nome, preco);
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public String precoEtiqueta() {
        return getNome() + " R$ " +  totalPreco() +  " (Custo importado: " + custoAdicional;

    }

    public double totalPreco() {
        return getPreco() + custoAdicional;
    }


}

package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.produto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    private static SimpleDateFormat sdf = new SimpleDateFormat("DD/mm/yyyy");
    private Date datadoProduto;

    public ProdutoUsado() {
    }

    public ProdutoUsado(Date datadoProduto) {
        this.datadoProduto = datadoProduto;
    }

    public ProdutoUsado(String nome, Double preco, Date datadoProduto) {
        super(nome, preco);
        this.datadoProduto = datadoProduto;
    }

    public Date getDatadoProduto() {
        return datadoProduto;
    }

    public void setDatadoProduto(Date datadoProduto) {
        this.datadoProduto = datadoProduto;
    }

    @Override
    public String precoEtiqueta() {
        return getNome() + " (usado)  R$ " +  getPreco() + " Data de uso " + sdf.format(getDatadoProduto());

    }

}

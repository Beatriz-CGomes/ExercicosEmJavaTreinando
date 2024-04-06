package professorNelioAlvesJava.exercicios15GenericsSetMap.map.exercicio.entities;

import java.util.Objects;

public class ProductsMap {

    private String nome;
    private Double preco;

    public ProductsMap(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsMap that = (ProductsMap) o;
        return Objects.equals(nome, that.nome) && Objects.equals(preco, that.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}

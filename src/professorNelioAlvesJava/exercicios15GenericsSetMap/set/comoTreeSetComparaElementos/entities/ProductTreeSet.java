package professorNelioAlvesJava.exercicios15GenericsSetMap.set.comoTreeSetComparaElementos.entities;

import java.util.Objects;

public class ProductTreeSet implements Comparable<ProductTreeSet> {

    private String name;
    private Double price;

    public ProductTreeSet(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTreeSet that = (ProductTreeSet) o;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


    @Override
    public String toString() {
        return "ProductTreeSet{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(ProductTreeSet other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}

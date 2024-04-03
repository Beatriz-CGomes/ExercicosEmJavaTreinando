package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.genericsDelimitados.entities;

public class ProductGenerics implements Comparable<ProductGenerics>{

    private String name;
    private Double price;

    public ProductGenerics(String name, Double price) {
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + ", " + String.format("%.2f", getPrice()));
        return sb.toString();
    }

    @Override
    public int compareTo(ProductGenerics other) {
        return price.compareTo(other.getPrice());
    }
}

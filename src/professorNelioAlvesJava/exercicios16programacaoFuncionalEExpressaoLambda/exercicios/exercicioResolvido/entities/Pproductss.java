package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioResolvido.entities;

public class Pproductss {

    private String name;
    private Double price;

    public Pproductss() {
    }

    public Pproductss(String name, Double price) {
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
        sb.append(getName() + ", R$ " + String.format("%.2f", getPrice()));
        return sb.toString();
    }
}

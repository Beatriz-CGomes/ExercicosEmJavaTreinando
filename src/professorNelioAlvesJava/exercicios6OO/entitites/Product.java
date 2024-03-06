package professorNelioAlvesJava.exercicios6OO.entitites;

public class Product {

    private String nome;
    private double price;
    private int quantity;

    public Product(String nome, double price, int quantity) {
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void removeProduct(int quantity) {
       this.quantity -= quantity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Product data: ");
        sb.append(getNome() + ", R$ " + getPrice() + ", " + getQuantity() + " units, Total: " + totalValueStock());
        return sb.toString();
    }
}

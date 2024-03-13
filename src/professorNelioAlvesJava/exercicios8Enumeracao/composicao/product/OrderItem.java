package professorNelioAlvesJava.exercicios8Enumeracao.composicao.product;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getProduct().getName() + ", R$ " + getPrice() + " " + " Quantity: " + getQuantity()
                + ", Subtotal: R$" + subTotal());
        return sb.toString();
    }

}

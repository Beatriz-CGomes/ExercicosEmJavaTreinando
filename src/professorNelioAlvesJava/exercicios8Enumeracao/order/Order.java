package professorNelioAlvesJava.exercicios8Enumeracao.order;

import java.util.Date;

public class Order {

    private Integer id;
    private Date momemt;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date momemt, OrderStatus status) {
        this.id = id;
        this.momemt = momemt;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomemt() {
        return momemt;
    }

    public void setMomemt(Date momemt) {
        this.momemt = momemt;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", momemt=" + momemt +
                ", status=" + status +
                '}';
    }
}

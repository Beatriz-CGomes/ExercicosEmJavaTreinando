package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.curingasDelimitados.entities;

public class CirculoCuringD implements FormaCuringaDelimitado {

    private Double radius;

    public CirculoCuringD(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Total Circulo: " + area();
    }
}

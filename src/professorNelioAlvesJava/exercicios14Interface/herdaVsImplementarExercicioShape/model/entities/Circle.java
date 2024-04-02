package professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.entities;

import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.enums.Colores;

public class Circle extends AbstractShape {

    private Double radius;

    public Circle(Colores colores, Double radius) {
        super(colores);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

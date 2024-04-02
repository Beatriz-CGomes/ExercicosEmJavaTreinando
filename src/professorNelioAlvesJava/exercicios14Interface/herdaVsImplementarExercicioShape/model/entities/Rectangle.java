package professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.entities;

import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.enums.Colores;

public class Rectangle extends AbstractShape implements Shape{

    private Double widht;
    private Double height;

    public Rectangle(Colores colores, Double widht, Double height) {
        super(colores);
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return widht * height;
    }
}

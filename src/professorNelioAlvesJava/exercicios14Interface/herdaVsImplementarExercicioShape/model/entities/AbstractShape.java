package professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.entities;

import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.enums.Colores;

public abstract class AbstractShape implements Shape {

    private Colores colores;

    public AbstractShape(Colores colores) {
        this.colores = colores;
    }

    public Colores getColores() {
        return colores;
    }

    public void setColores(Colores colores) {
        this.colores = colores;
    }
}

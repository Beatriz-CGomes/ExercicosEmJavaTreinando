package professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.application;

import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.entities.AbstractShape;
import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.entities.Circle;
import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.entities.Rectangle;
import professorNelioAlvesJava.exercicios14Interface.herdaVsImplementarExercicioShape.model.enums.Colores;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AbstractShape s1 = new Circle(Colores.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Colores.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColores());
        System.out.println("Circle Area: " + String.format("%.2f", s1.area()));
        System.out.println();
        System.out.println("Rectable Color: " + s2.getColores());
        System.out.println("Rectangle Area: " + String.format("%.2f", s2.area()));


        sc.close();
    }
}

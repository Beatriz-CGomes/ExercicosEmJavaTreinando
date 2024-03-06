package professorNelioAlvesJava.exercicios6OO.application;

import professorNelioAlvesJava.exercicios6OO.entitites.Triangle;

import java.util.Scanner;

public class TriangleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x1 = new Triangle();
        Triangle y1 = new Triangle();

        System.out.println("Enter the mesasures of triangle x: ");
        x1.setA(3.00);
        x1.setB(4.00);
        x1.setC(5.00);

        System.out.println("Enter the mesasures of triangle y: ");
        y1.setA(7.50);
        y1.setB(4.50);
        y1.setC(4.02);

        double x = x1.areaTriangle();
        double y = y1.areaTriangle();

        System.out.println("Tringle X area: " + x);
        System.out.println("Tringle Y area: " + y);

        if (x > y) {
            System.out.println("Large area : X");
        } else {
            System.out.println("Large area : Y");
        }

        sc.close();
    }
}

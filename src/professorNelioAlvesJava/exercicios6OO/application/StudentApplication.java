package professorNelioAlvesJava.exercicios6OO.application;

import professorNelioAlvesJava.exercicios6OO.entitites.Student;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Grade 1: ");
        double grade1 = sc.nextDouble();

        System.out.println("Grade 2: ");
        double grade2 = sc.nextDouble();

        System.out.println("Grade 3: ");
        double grade3 = sc.nextDouble();
        Student student = new Student(name, grade1, grade2, grade3);

        if (student.sunGrade() < 60.0) {
            System.out.println(student);
            student.mensageGrade();
            System.out.println("MISSING " + student.missingGrade() + " POINTS");
        } else {
            System.out.println(student);
            student.mensageGrade();
        }

        sc.close();
    }
}

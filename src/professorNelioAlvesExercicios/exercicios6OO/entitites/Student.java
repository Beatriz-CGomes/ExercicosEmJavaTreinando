package professorNelioAlvesExercicios.exercicios6OO.entitites;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public double sunGrade() {
        return grade1 + grade2 + grade3;
    }

    public void mensageGrade() {
        if (sunGrade() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }
    }

    double soma= 0;
    public double missingGrade() {
        if (sunGrade() < 60.0) {
            soma = 60.0 - sunGrade();
        }
        return soma;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FINAL GRADE: " + sunGrade());
        return sb.toString();
    }


}

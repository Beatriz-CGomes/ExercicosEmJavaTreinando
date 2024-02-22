package professorNelioAlvesExercicios.exercicios6OO.entitites;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double nextSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double porcentage) {
        this.grossSalary = this.grossSalary * porcentage / 100 + this.grossSalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee: " + getName() + ", R$ " + nextSalary());
        return sb.toString();
    }
}

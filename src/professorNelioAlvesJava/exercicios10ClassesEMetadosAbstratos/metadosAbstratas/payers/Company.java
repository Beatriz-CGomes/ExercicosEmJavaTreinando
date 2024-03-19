package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.metadosAbstratas.payers;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double basicNumberOfE = 0;
        if (numberOfEmployees > 10) {
            basicNumberOfE = getAnualIncome() * 0.14;
        } else {
            basicNumberOfE = getAnualIncome() * 0.16;
        }
        return basicNumberOfE;
    }
}

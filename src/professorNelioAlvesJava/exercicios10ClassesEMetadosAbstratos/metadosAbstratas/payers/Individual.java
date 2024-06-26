package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.metadosAbstratas.payers;

public class Individual extends TaxPayer {

    private Double health;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double health) {
        super(name, anualIncome);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public double tax() {
        double basicTax = 0;
        if (getAnualIncome() <= 2000) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealth() * 0.50;
        return basicTax;
    }
}

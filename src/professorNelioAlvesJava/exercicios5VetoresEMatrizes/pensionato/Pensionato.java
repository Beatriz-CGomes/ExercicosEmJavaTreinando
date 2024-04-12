package professorNelioAlvesJava.exercicios5VetoresEMatrizes.pensionato;

public class Pensionato {

    private String name;
    private String email;

    public Pensionato(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + ", " + getEmail());
        return sb.toString();
    }
}

package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.exercicios.exercicioDeFixacao.entities;

public class FuncFunc {

    private String name;
    private String email;
    private Double salary;

    public FuncFunc(){

    }

    public FuncFunc(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getEmail());
        return sb.toString();
    }
}

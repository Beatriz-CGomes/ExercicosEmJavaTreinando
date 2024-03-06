package professorNelioAlvesJava.teoria2lista;

import java.util.List;

public class ListEmployee {

    private Integer id;
    private String name;
    private Double salary;

    public ListEmployee() {
    }

    public ListEmployee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Double getSalary() {
        return salary;
    }

    public double increaseSalry(Double porcetage) {
        return salary = salary * porcetage / 100 + salary;

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId() + ", " + getName() + ", " + getSalary());
        return sb.toString();
    }

    //segunda forma para se fazer para buscar o id
    public Integer position(List<ListEmployee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }


}

package exercicios_1Basicos.Herança.model;

public class AnimalGato extends Animal {

    private char roendoMovies = 's';

    public AnimalGato(char roendoMovies) {
        this.roendoMovies = roendoMovies;
    }

    public AnimalGato(String nome, int idade, String raca, char roendoMovies) {
        super(nome, idade, raca);
        this.roendoMovies = roendoMovies;
    }

    public char getRoendoMovies() {
        return roendoMovies;
    }

    @Override
    public String emitirSom() {
        return "MIAU MIAU MIAU";
    }

    public void roendoMovies(char roer) {
        if (roer == 'S' || roer == 's') {
            System.out.println("Roendo Movies");
        } else {
            System.out.println("Não roendo moveis");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** DADOS DO GATO ** \n");
        sb.append("Nome: " + getNome() + "\n");
        sb.append("Idade: " + getIdade() + "\n");
        sb.append("Raça: " + getRaca() + "\n");
        sb.append(emitirSom());
        return sb.toString();
    }

}

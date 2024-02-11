package exercicios_1Basicos.Herança.model;

public class AnimalCachorro extends Animal {

    private char bravo = 's';

    public AnimalCachorro(String nome, int idade, String raca, char bravo) {
        super(nome, idade, raca);
        this.bravo = bravo;
    }

    public char getBravo() {
        return bravo;
    }

    @Override
    public String emitirSom() {
        return "AUAUAUAUA";
    }

    public void bravo(char bravo) {
        if (bravo == 's' || bravo == 'S') {
            System.out.println("Cachorro está bravo");
        } else {
            System.out.println("Cachorro não está bravo");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** DADOS DO CACHORRO ** \n");
        sb.append("Nome: " + getNome() + "\n");
        sb.append("Idade: " + getIdade() + "\n");
        sb.append("Raça: " + getRaca() + "\n");
        sb.append(emitirSom());
        return sb.toString();
    }
}

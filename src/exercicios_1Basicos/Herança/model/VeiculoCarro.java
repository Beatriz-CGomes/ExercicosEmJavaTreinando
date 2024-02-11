package exercicios_1Basicos.Herança.model;

public class VeiculoCarro extends  Veiculo{

    private String cor;
    private int portas;

    public VeiculoCarro(String marca, String modelo, int ano, String cor, int portas) {
        super(marca, modelo, ano);
        this.cor = cor;
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public void veiculoLigado(char response) {
        super.veiculoLigado(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** CARRO ** \n");
        sb.append("MARCA: " + getMarca() + "\n");
        sb.append("MODELO: " + getModelo() + "\n");
        sb.append("ANO: " + getAno() + "\n");
        sb.append("COR: " + cor + "\n");
        sb.append("Quantidade de portas do veiculo: " + portas);
        return sb.toString();
    }
}

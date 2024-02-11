package exercicios_1Basicos.Herança.model;

public class VeiculoMoto extends Veiculo{

    private String op;

    public VeiculoMoto(String marca, String modelo, int ano, String op) {
        super(marca, modelo, ano);
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    @Override
    public void veiculoLigado(char response) {
        super.veiculoLigado(response);
    }

    public String opcaoMoto(String op){
        if(op == "city"){
            return "City";
        } else {
            return "Street ";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** MOTO ** \n");
        sb.append("MARCA: " + getMarca() + "\n");
        sb.append("MODELO: " + getModelo() + "\n");
        sb.append("ANO: " + getAno());
        return sb.toString();
    }

}

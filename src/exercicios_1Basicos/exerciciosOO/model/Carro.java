package exercicios_1Basicos.exerciciosOO.model;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void ligarCarro(char responseCar) {
        if (responseCar == 'S' || responseCar == 's') {
            System.out.println("Carro Liagado");
        } else {
            System.out.println("Carro Desligado");
        }
    }

    public int acelerarCarro(int velocidade) {
        if (velocidade <= 40) {
            velocidade += 10;
            return velocidade;
        } else {
            velocidade -= 10;
            return velocidade;
        }
    }

    public void frearCarro(char responseFrear){
        if(responseFrear == 'S' || responseFrear == 's'){
            System.out.println("Frear Carro");
        } else {
            System.out.println("Continuar como está");
        }
    }

    @Override
    public String toString(){
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano: " + ano;
    }


}

package exercicios_1Basicos.exerciciosOO.model;

public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double calculaArea(){
        double calc = altura * largura;
        return calc;
    }

    public double calculaPerimetro(){
        double peri = 2 * (altura + largura);
        return peri;
    }

    @Override
    public String toString(){
        return "Altura: " + altura + "\n" +
                "Largura: " + largura + "\n" +
                "Calcula Area: " + calculaArea() + "\n" +
                "Calcula Perimetro: " + calculaPerimetro();
    }
}

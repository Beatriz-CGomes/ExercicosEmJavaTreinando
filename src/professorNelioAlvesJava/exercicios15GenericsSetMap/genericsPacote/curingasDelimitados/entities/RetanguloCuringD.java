package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.curingasDelimitados.entities;

public class RetanguloCuringD implements FormaCuringaDelimitado {

    private Double altura;
    private Double largua;

    public RetanguloCuringD(Double altura, Double largua) {
        this.altura = altura;
        this.largua = largua;
    }

    public Double getAltura() {
        return altura;
    }


    public Double getLargua() {
        return largua;
    }

    @Override
    public double area() {
        return altura * largua;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total Area Retangulo" + area());
        return sb.toString();
    }
}

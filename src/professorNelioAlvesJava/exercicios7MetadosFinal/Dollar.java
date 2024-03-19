package professorNelioAlvesJava.exercicios7MetadosFinal;

public class Dollar {

    public static final double DOLAR = 3.10;

    public static double valueDollarToReal(double dolarBuy, double porcentage) {
        double sunValue = dolarBuy * DOLAR;
        return sunValue * porcentage / 100 + sunValue;
    }
}

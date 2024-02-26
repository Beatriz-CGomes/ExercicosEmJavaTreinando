package professorNelioAlvesExercicios.exercicios7MetadosAbastrato;

import java.util.Scanner;

public class DollarApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many dollar will be bought? ");
        double dolarBuy = sc.nextDouble();

        System.out.println("What is the discount percentage? ");
        double porcentage = sc.nextDouble();

        System.out.println("Amount to be paid in reais: " + Dollar.valueDollarToReal(dolarBuy, porcentage));
        sc.close();
    }
}

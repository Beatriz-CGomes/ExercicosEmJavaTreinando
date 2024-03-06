package professorNelioAlvesJava.exercicios3While;

import java.util.Scanner;

public class Exercicio2PostoDeGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorAlcool = 0;
        int contadorGasolina = 0;
        int contadorDiesel = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\tPOSTO DE GASOLINA");
            System.out.println("\t");
            System.out.println("\t1 - Alcool  ");
            System.out.println("\t2 - Gasolina  ");
            System.out.println("\t3 - Diesel  ");
            System.out.println("\t4 - Sair  ");
            System.out.println("\t");
            System.out.println("\tEntra com uma opção para abastercer seu veiculo");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    contadorAlcool++;
                    break;

                case 2:
                    contadorGasolina++;
                    break;

                case 3:
                    contadorDiesel++;
                    break;

                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;

                default:
                    System.out.println("Entre com uma opção valida");
                    break;
            }
        }

        System.out.println("Alcool: " + contadorAlcool);
        System.out.println("Gasolina: " + contadorGasolina);
        System.out.println("Diesel: " + contadorDiesel);

        sc.close();
    }
}

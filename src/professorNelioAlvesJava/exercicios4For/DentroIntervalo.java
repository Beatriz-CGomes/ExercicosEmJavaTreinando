package professorNelioAlvesJava.exercicios4For;

import java.util.Scanner;

public class DentroIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão lidos:");
        int numero = sc.nextInt();

        int[] vect = new int[numero];

        int contInt = 0, contOunt = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o numero da posição " + (i + 1) + " : ");
            int num = sc.nextInt();

            if (num >= 10 && num <= 20) {
                contInt++;
            } else {
                contOunt++;
            }
        }

        System.out.println();
        System.out.println(contInt + " INT ");
        System.out.println(contOunt + " OUT ");

        sc.close();
    }
}

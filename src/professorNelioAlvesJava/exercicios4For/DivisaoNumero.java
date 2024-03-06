package professorNelioAlvesJava.exercicios4For;

import java.util.Scanner;

public class DivisaoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero = ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                System.out.println(i);
            }

        }

        sc.close();
    }
}

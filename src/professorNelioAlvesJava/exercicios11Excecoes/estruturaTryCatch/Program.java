package professorNelioAlvesJava.exercicios11Excecoes.estruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalide position! ");
        } catch (InputMismatchException e) {
            System.out.println("Only numbers allowed");
        }

        System.out.println("End of program");
        sc.close();
    }
}

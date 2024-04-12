package professorNelioAlvesJava.exercicios5VetoresEMatrizes.pensionato;

import java.util.Scanner;

public class PensionatoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will ne rented? ");
        int numeros = sc.nextInt();

        Pensionato[] rooms = new Pensionato[10];
        Pensionato[] rent = new Pensionato[numeros];

        for (int i = 0; i < rent.length; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Pensionato(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }

}
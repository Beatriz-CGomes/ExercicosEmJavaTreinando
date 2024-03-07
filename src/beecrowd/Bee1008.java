package beecrowd;

import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("MATRICULA: ");
        int mat = sc.nextInt();

        System.out.print("HORAS TRABALHADAS: ");
        double houras = sc.nextInt();

        System.out.print("VALOR POR HORA: ");
        double valorH = sc.nextDouble();

        double sum = houras * valorH;

        System.out.println();
        System.out.println("NUMBER = " + mat);
        System.out.println("SALARY = U$ " + sum);


        sc.close();
    }
}

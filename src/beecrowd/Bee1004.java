package beecrowd;

import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A: ");
        int a = sc.nextInt();

        System.out.println("B: ");
        int b = sc.nextInt();

        int prod = a * b;
        System.out.println("PROD = " + prod);

        sc.close();
    }
}

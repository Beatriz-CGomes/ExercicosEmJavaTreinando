package professorNelioAlvesJava.exercicios7MetadosAbastrato;

import java.util.Scanner;

public class RadiusApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = sc.nextDouble();

        double c = Radius.circumference(radius);

        double v = Radius.volume(radius);

        System.out.println("Circumference " + c);
        System.out.println("Volume: " + v);
        System.out.println("PI value " + Radius.PI);

        sc.close();
    }
}

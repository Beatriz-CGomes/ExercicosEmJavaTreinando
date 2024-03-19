package professorNelioAlvesJava.exercicios10ClassesEMetadosAbstratos.metadosAbstratas.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char resp = sc.next().charAt(0);

            System.out.print("Color: ");
            Color color = Color.valueOf(sc.next());

            if (resp == 'r' || resp == 'R') {
                System.out.print("Width: ");
                double w = sc.nextDouble();

                System.out.print("Height: ");
                double h = sc.nextDouble();

                list.add(new Rectangle(color, w, h));

            } else {
                System.out.print("Radius: ");
                double r = sc.nextDouble();

                list.add(new Circle(color, r));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape s : list) {
            System.out.println(String.format("%.2f", s.area()));
        }

        sc.close();
    }
}

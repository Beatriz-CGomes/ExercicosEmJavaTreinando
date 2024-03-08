package professorNelioAlvesJava.exercicios8Enumeracao.product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYY): ");
        Date date = sdf.parse(sc.next());
        sc.nextLine();
        Client client = new Client(name, email, date);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        String level = sc.nextLine();
        Order order = new Order(OrderStatus.valueOf(level));


        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, new Product(productName, price));
            System.out.println();
            System.out.println(orderItem);
        }

        System.out.println(order);
        System.out.println(client);


        sc.close();
    }
}

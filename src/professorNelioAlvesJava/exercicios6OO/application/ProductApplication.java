package professorNelioAlvesJava.exercicios6OO.application;

import professorNelioAlvesJava.exercicios6OO.entitites.Product;

import java.util.Scanner;

public class ProductApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println(product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println(product);


        sc.close();
    }
}

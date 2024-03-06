package professorNelioAlvesJava.exercicios6OO.application;

import professorNelioAlvesJava.exercicios6OO.entitites.Account;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        System.out.print("Entrer account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there a initial deposit value ? (y/n) ");
        char res = sc.next().charAt(0);

        if (res == 's' || res == 'S') {
            System.out.print("Enter initial value: ");
            double initialValue = sc.nextDouble();
            ac = new Account(accountNumber, holder, initialValue);
        } else {
            ac = new Account(accountNumber, holder);
        }

        System.out.println("Account data: ");
        System.out.println(ac);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        ac.deposit(deposit);
        System.out.println("Update account: ");
        System.out.println(ac);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);
        System.out.println("Update account: ");
        System.out.println(ac);
        sc.close();
    }
}

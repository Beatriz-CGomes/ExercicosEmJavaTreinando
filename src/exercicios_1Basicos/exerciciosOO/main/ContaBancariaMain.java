package exercicios_1Basicos.exerciciosOO.main;

import exercicios_1Basicos.exerciciosOO.model.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double deposito = 0;
        double saque = 0;

        System.out.println("Entra com titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Entra com o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Saldo conta: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldo);

        //DEPOSITO
        System.out.println("Você deseja realizar um deposito? (s/n)");
        char response = sc.next().charAt(0);

        if(response == 's' || response == 'S'){
            System.out.println("Digite o valor do deposito");
            deposito = sc.nextDouble();
            conta.deposito(deposito);
            System.out.println("deposittoooo " + conta.deposito(deposito));
        }
            //SAQUE
            System.out.println("Você deseja realizar um saque? (s/n) ");
            char respondeS = sc.next().charAt(0);

            if (respondeS == 'S' || respondeS == 's'){
                System.out.println("Digite o valor que deseja sacar: ");
                saque = sc.nextDouble();
                conta.saque(saque);
                System.out.println(conta.saque(saque));
            }

            System.out.println();
            System.out.println(conta);

        sc.close();
    }
}

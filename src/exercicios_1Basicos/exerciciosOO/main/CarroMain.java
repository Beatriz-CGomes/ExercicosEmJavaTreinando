package exercicios_1Basicos.exerciciosOO.main;

import exercicios_1Basicos.exerciciosOO.model.Carro;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("MARCA:");
        String marca = sc.nextLine();

        System.out.println("MODELO:");
        String modelo = sc.nextLine();

        System.out.println("ANO: ");
        int ano = sc.nextInt();

        carro = new Carro(marca, modelo, ano);

        System.out.println("Voce deseja ligar o carro? (s/n)");
        char responseCar = sc.next().charAt(0);
        carro.ligarCarro(responseCar);

        System.out.println("Digite sua velocidade: ");
        int velocidade = sc.nextInt();
        carro.acelerarCarro(velocidade);

        System.out.println("Você deseja frear o carro? (s/n)");
        char responseFrear = sc.next().charAt(0);
        carro.frearCarro(responseFrear);

        System.out.println("DADOS DO CARRO: ");
        System.out.println();
        System.out.println(carro);

        sc.close();
    }
}

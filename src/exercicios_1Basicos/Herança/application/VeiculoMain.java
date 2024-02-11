package exercicios_1Basicos.Herança.application;

import exercicios_1Basicos.Herança.model.VeiculoCarro;
import exercicios_1Basicos.Herança.model.VeiculoMoto;

import java.util.Scanner;

public class VeiculoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.nextLine();

        System.out.println("Modelo: ");
        String modelo = sc.nextLine();

        System.out.println("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a cor do seu carro: ");
        String cor = sc.nextLine();

        System.out.println("Quantidade de portas: ");
        int portas = sc.nextInt();

        System.out.println("Seu veiculo está ligado: (s/n)");
        char response = sc.next().charAt(0);

        VeiculoCarro carro = new VeiculoCarro(marca, modelo, ano, cor, portas);
        System.out.println(carro);
        carro.veiculoLigado(response);
        System.out.println("***********************************");
        sc.nextLine();

        System.out.println("Marca: ");
        String marca2 = sc.nextLine();

        System.out.println("Modelo: ");
        String modelo2 = sc.nextLine();

        System.out.println("Ano: ");
        int ano2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite se seu modelo é city ou street: ");
        String op = sc.nextLine();

        System.out.println("Seu veiculo está ligado: (s/n)");
        char response2 = sc.next().charAt(0);

        VeiculoMoto moto = new VeiculoMoto(marca2, modelo2, ano2, op);
        System.out.println(moto);
        System.out.println(moto.opcaoMoto(op));
        moto.veiculoLigado(response2);


        sc.close();
    }
}


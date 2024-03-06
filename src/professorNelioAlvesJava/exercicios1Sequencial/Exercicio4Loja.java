package professorNelioAlvesJava.exercicios1Sequencial;

import java.util.Scanner;

public class Exercicio4Loja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidae de vezes que vc deseja pesquisar: ");
        int total = sc.nextInt();

        int[] somaP = new int[total];

        int[] codigo = new int[total];
        int[] quantidade = new int[total];
        double[] preco = new double[total];

        double soma = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Código: " + (i + 1));
            codigo[i] = sc.nextInt();

            System.out.println("Quantidade: " + (i + 1));
            quantidade[i] = sc.nextInt();

            System.out.println("Preço: " + (i + 1));
            preco[i] = sc.nextDouble();

            soma += quantidade[i] * preco[i];
            //10,20 = 10,20 + 5,30 = 15,50
            // Se eu não atribuir o valor da soma recebendo ela mesma estarei apenas calculando o valor de um item, para ter a soma total dos itens
            // é necessário que eu calcula o valor da soma dela mesmo de um item recebendo o valor total das quantidade restante
        }


        System.out.println("VALOR A PAGAR = R$ " + soma);


        sc.close();

    }
}


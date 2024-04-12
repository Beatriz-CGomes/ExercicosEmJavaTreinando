package professorNelioAlvesJava.exercicios5VetoresEMatrizes.dadosPessoas;

import java.util.Scanner;

public class DadosPessoasApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos pessoas serão digitadas? ");
        int num = sc.nextInt();
        DadosPessoas[] dados = new DadosPessoas[num];

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");

            System.out.print("Altura");
            double altura = sc.nextDouble();

            System.out.print("Genero: ");
            char genero = sc.next().charAt(0);

            dados[i] = new DadosPessoas(genero, altura);
        }

        double menorAltura = dados[0].getAltura();
        double maiorAltura = dados[0].getAltura();


        for (int i = 0; i < dados.length; i++) {
            if (dados[i].getAltura() < menorAltura) {
                menorAltura = dados[i].getAltura();
            }

            if (dados[i].getAltura() > maiorAltura) {
                maiorAltura = dados[i].getAltura();
            }

        }

        System.out.println("Menor Altura  = " + menorAltura);
        System.out.println("Maior Altura  = " + maiorAltura);

        double contMulheres = 0, contHomens = 0;
        double somaAlturaMulheres = 0, soma = 0;
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].getGenero() == 'f' || dados[i].getGenero() == 'F') {
                contMulheres++;
                soma += dados[i].getAltura();
                somaAlturaMulheres = soma / contMulheres;
            } else {
                contHomens++;
            }
        }
        System.out.printf("Media das alturas das mulheres %.2f%n", somaAlturaMulheres);
        System.out.println("Numero de homens " + contHomens);


        sc.close();
    }
}

package professorNelioAlvesJava.exercicios2Condicional;

import java.util.Scanner;

public class Exercicio6Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioImposto = 0;

        System.out.println("\tTABELA DO IMPOSTO DA EMPRESA");
        System.out.println("\t");
        System.out.println("\t1 - de 0.00 a R$ 2000.0 - ISENTO  ");
        System.out.println("\t2 - de R$ 2000.01 a R$ 3000.0 - 8%  ");
        System.out.println("\t3 - de R$ 3000.01 a R$ 4500.0 - 18%  ");
        System.out.println("\t4 - acima de  R$ 4500.01 - 28%  ");
        System.out.println("\t");
        System.out.println("\tEntra com opção do seu salario");
        int opcaoSalario = sc.nextInt();

        System.out.println("Digite o valor so seu salario: ");
        double salario = sc.nextDouble();

        switch (opcaoSalario) {
            case 1:
                System.out.println("Isento");
                if (salario > 2000) {
                    System.out.println("Você digitou a opção errada");
                }
                break;

            case 2:
                salarioImposto = (salario - 2000) * 0.08;
                System.out.println("R$ " + salarioImposto);
                break;

            case 3:
                salarioImposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
                System.out.println("R$ " + salarioImposto);
                break;

            case 4:
                salarioImposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
                System.out.println("R$ " + salarioImposto);
        }

        sc.close();

    }
}

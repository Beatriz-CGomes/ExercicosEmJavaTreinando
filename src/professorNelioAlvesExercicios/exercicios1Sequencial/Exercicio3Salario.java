package professorNelioAlvesExercicios.exercicios1Sequencial;

import java.util.Scanner;

public class Exercicio3Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTRA COM OS DADOS DO FUNCIONARIO: ");
        System.out.println("Matricula: ");
        int numeroFunc = sc.nextInt();

        System.out.println("Total de horas trabalhadas no mês");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Valor recebido por hora: ");
        double valorHora = sc.nextDouble();

        double valorSalario = horasTrabalhadas * valorHora;

        System.out.println("Número = " + numeroFunc);
        System.out.println("Salário = R$ " + valorSalario);
        sc.close();
    }
}

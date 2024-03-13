package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.teorico.sobreposicaoAndMetadoFinal;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sem sobreposição
        Account3 acc1 = new Account3(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        //com sobreposição
        Account3 acc2 = new SavingAccount3(1002, "Bob", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        //Usando a palavra super no metado
        Account3 acc3 = new BussinessAccount3(1003, "Maria", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        sc.close();
    }
}

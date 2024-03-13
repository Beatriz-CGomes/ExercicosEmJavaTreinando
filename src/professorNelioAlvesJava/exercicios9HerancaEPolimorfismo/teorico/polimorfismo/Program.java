package professorNelioAlvesJava.exercicios9HerancaEPolimorfismo.teorico.polimorfismo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account4 acc9 = new Account4(1020, "Nick", 1000.0);
        Account4 acc10 = new SavingAccount4(1021, "Theo", 1000.0, 0.02);

        acc9.withdraw(50.0);
        acc10.withdraw(50.0);

        System.out.println(acc9.getBalance());
        System.out.println(acc10.getBalance());


        sc.close();
    }
}

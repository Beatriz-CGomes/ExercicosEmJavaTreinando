package professorNelioAlvesJava.exercicios9Heranca.teorico.upcastingAndDowncasting;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account2 acc2 = new Account2(1001, "Alex", 0.0);
        BussinessAccount2 buss2 = new BussinessAccount2(1002, "Maria", 200.0, 500.0);

        //UPCASTING é pega o subclasse e atribui a uma superclasse
        //Não gera erro pq herança é relação para 1 - uma subclasse também é uma superclasse
        Account2 acc3 = buss2;
        Account2 acc4 = new BussinessAccount2(1003, "Bob", 0.0, 200.0);
        Account2 acc5 = new SavingAccount2(1004, "Ana", 0.0, 250.0);

        //DOWNCASTING é pegar a superclasse e atribui para sublasse
        //gera um erro pq não sabe se a conversão é segura
        //é necessário fazer um casting manual
        BussinessAccount2 buss3 = (BussinessAccount2) acc4;
        buss3.loan(200);
        ((BussinessAccount2) acc4).loan(600);


        //Aqui gera um erro pq pegamos duas subclasses que não são a mesma classe e o erro só gera o erro na hora de copilar
        if (acc5 instanceof BussinessAccount2) {
            BussinessAccount2 acc6 = (BussinessAccount2) acc5;
            ((BussinessAccount2) acc5).loan(500.0);
            acc6.loan(500.0);
            System.out.println("Emprestimo");
        }

        if (acc5 instanceof SavingAccount2) {
            SavingAccount2 acc6 = (SavingAccount2) acc5;
            acc6.updateBlance();
            System.out.println("UPDATE");
        }



        sc.close();
    }
}

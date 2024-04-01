package professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.application;

import professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.entities.Contract;
import professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.entities.Installment;
import professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.service.ContractService;
import professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValor = sc.nextDouble();

        Contract contract = new Contract(numero, data, totalValor);

        System.out.print("Entre com número de parcelas: ");
        int parcelas = sc.nextInt();

        //isso é uma injeção de dependencia que está passando no contrutor um
        //OnlinePaymentService que é a interface
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, parcelas);

        System.out.println();
        System.out.println("Parcelas: ");
        //dentro da classe contrato que tem installment(que sao as parcelas)
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}

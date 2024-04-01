package professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.service;

import professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.entities.Contract;
import professorNelioAlvesJava.exercicios14Interface.exercicioDeFixacao.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    //metado responsaveis pelos calculos
    public void processContract(Contract contract, int months) {

        //aqui e=u pego o valor do contrato e divido pela quantidade de parcelas
        double basicQuota = contract.getTotalValue() / months;

        //quando começar o for e o i valer (1) esse será o primeiro mês da parcela - Assim que o i voltar e for acrencentando mais  será o 2 mes e vai indo
        for (int i = 1; i <= months; i++) {
            //aqui estou usando essa funcao para acrescentar os meses
            //está chamando o metado plusMonths(i); para adicionar um numero especifo de meses a essa data
            LocalDate dueDate = contract.getDate().plusMonths(i);

            //aqui colocando uma variavel i porque ela que vai passar os meses parcelados
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.PaymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));

        }


    }
}

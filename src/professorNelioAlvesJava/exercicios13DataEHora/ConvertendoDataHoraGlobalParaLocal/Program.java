package professorNelioAlvesJava.exercicios13DataEHora.ConvertendoDataHoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        //convertendo do global para local
        LocalDate d01 = LocalDate.parse("2024-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2024-07-20T16:30:26");
        Instant d03 = Instant.parse("2024-07-20T11:30:26Z");

        //tem que informar a data global e o timezone
        //convertendo meu intante para uma data local considerando a data do meu computador
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        System.out.println(r1);

        //muda dependendo do local
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println(r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println();
        System.out.println(r3);
        System.out.println(r4);

        //Obter dados de uma data-hora local - dia-mes-ano - horario
        System.out.println();
        System.out.println("Dia do d01 = " + d01.getDayOfMonth());
        System.out.println("Mes do d01 = " + d01.getMonthValue());
        System.out.println("Ano do d01 = " + d01.getYear());

        System.out.println();
        System.out.println("Hora do d02 = " + d02.getHour());
        System.out.println("Minutos do d02 = " + d02.getMinute());


        /*
        //retorna uma coleção com os nomes dos fuso horarios customizados
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        } */


    }
}

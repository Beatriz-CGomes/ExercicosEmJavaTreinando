package professorNelioAlvesJava.exercicios13DataEHora.calculosDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        //Calculos com data e hora - acrescentar ou subtrair
        //data-hora são imutáveis em java

        LocalDate d01 = LocalDate.parse("2024-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2024-07-20T16:30:26");
        Instant d03 = Instant.parse("2024-07-20T11:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        System.out.println();
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekLocalInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
        System.out.println();
        System.out.println("pastWeekLocalInstant = " + pastWeekLocalInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //Duaração duas datas horas e descobri a duração entre elas
        Duration duration1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println("LocalDateTime " + duration1.toDays());


        //nao tem como calcular apenas com local date pq precisa dos segundo precisa converter
        // Duration duration2 = Duration.between(pastWeekLocalDate, d01); - desse jeito nao vai precisa converter como na linha de baixo
        Duration duration2 = Duration.between(pastWeekLocalDate.atTime(0,0), d01.atTime(0,0));
        Duration duration3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay()); //forma simplificada para nao ficar colocando 0,0
        System.out.println("LocalDateTime "  + duration2.toDays());
        System.out.println(duration3.toDays());


        Duration duration4 = Duration.between(pastWeekLocalInstant, d03);
        Duration duration5 = Duration.between(d03, pastWeekLocalInstant);
        System.out.println("Instant " + duration4.toDays());
        System.out.println(duration5.toDays());


    }
}

package professorNelioAlvesJava.exercicios13DataEHora.instanciadoDataHoraEmJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //instanciação
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); //aqui gerou no horario de londres

        System.out.println("Local Date = " + d01);
        System.out.println("Local Date Time = " + d02);
        System.out.println("Instant = " + d03);

        //texto ISO
        LocalDate d04 = LocalDate.parse("2024-03-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-20T15:07:26");
        Instant d06 = Instant.parse("2024-03-20T15:09:26Z");

        System.out.println("Texto ISO = " + d04);
        System.out.println(d05);
        System.out.println(d06);

        //Instanciar um horario de um local para o outro
        Instant d07 = Instant.parse("2024-03-20T15:09:26-03:00");
        System.out.println(d07);

        //texto no formato customizado
        LocalDate d08 = LocalDate.parse("20/07/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("21/07/2024 01:30", fmt2);

        System.out.println(d08);
        System.out.println(d09);


        //datas isoladas dia mes e ano
        LocalDate d10 = LocalDate.of(2024, 03, 26);
        LocalDateTime d11 = LocalDateTime.of(2024,03,06, 15, 11);

        System.out.println(d10);
        System.out.println(d11);
    }
}

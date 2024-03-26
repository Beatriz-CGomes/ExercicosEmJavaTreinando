package professorNelioAlvesJava.exercicios13DataEHora.convertendoDataHoraParaTexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Program {
    public static void main(String[] args) {

        //transforamando data-hora em texto - texto customizado
        LocalDate d01 = LocalDate.parse("2024-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2024-07-20T16:30:26");
        Instant d03 = Instant.parse("2024-07-20T11:30:26Z");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d01.format(fmt1));
        System.out.println(fmt1.format(d01));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println();
        System.out.println(d02);
        System.out.println(d02.format(fmt2));

        //pegando o fuso horario do computador do do usuario - ZoneId.systemDefault()
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println();
        System.out.println(d03);
        System.out.println(fmt3.format(d03));


        //ISO DATE TIME NÃO TEM FUSO HORARIO
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println();
        System.out.println(d02.format(fmt4));
        System.out.println(d02.toString());

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println();
        System.out.println(fmt5.format(d03));
        System.out.println(d03.toString());


    }
}

package professorNelioAlvesJava.exercicios13DataEHora.dateJava7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        //data representa um instante
        //SimpleDateFormat - define formato para conversão entre Date e String

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        //data com horario atual
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        //criar uma data corresponte a uma data que quero criar
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));

        Date y1 = sdf1.parse("25/06/2024");
        Date y2 = sdf2.parse("26/07/2024 20:01:30");

        System.out.println("------------------------");
        System.out.println();
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));

        //instanciar uma data no formato ISO 8601
        Date y3 = Date.from(Instant.parse("2024-03-26T20:13:40Z"));
        System.out.println("Y3: " + sdf2.format(y3));

        System.out.println("------------------------");
        System.out.println("\tSDF3");
        System.out.println();
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("Y3: " + sdf3.format(y3));

    }
}

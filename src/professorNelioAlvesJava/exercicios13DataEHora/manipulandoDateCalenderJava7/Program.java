package professorNelioAlvesJava.exercicios13DataEHora.manipulandoDateCalenderJava7;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        //manipulando uma data pelo canlender
        //geralmente usado com sistema legado

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2024-03-26T20:23:07Z"));
        System.out.println(sdf.format(d));

        //acrecentar 4 horas
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR,4);
        d = cal.getTime();
        System.out.println(sdf.format(d));

        //obtendo uma unidade de tempo
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);

        System.out.println("Minutos: " + minutos);
        System.out.println("Mes: " + mes);
    }
}

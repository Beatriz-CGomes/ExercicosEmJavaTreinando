package professorNelioAlvesJava.exercicios11Excecoes.criandoExcecoesPersonalizadas.model.entitites;

import professorNelioAlvesJava.exercicios11Excecoes.criandoExcecoesPersonalizadas.model.entitites.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }


    public long duration() {
        // fazendo o calculo usando o milesegundos
        long diff = checkOut.getTime() - checkIn.getTime();
        //convertendo o valor de milisegundos em dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public void updateDate(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Error in reservation: Reservation dates for updte must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room " + getRoomNumber() + ", check-in:  " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
                + ", " + duration() + " nights ");

        return sb.toString();
    }
}

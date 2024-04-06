package professorNelioAlvesJava.exercicios15GenericsSetMap.exercicioResolvido.entities;

import java.util.Date;
import java.util.Objects;

public class EntradaLog {

    private String nomeUsuario;
    private Date momento;

    public EntradaLog(String nomeUsuario, Date momento) {
        this.nomeUsuario = nomeUsuario;
        this.momento = momento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Date getMomento() {
        return momento;
    }

    //para saber se possui o mesmo  nome no sistema para não ter repetição
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaLog that = (EntradaLog) o;
        return Objects.equals(nomeUsuario, that.nomeUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUsuario);
    }
}

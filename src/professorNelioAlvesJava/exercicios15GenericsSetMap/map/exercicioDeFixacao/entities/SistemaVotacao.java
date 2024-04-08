package professorNelioAlvesJava.exercicios15GenericsSetMap.map.exercicioDeFixacao.entities;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class SistemaVotacao {

    private String nome;
    private Integer votos;

    public SistemaVotacao(String nome, Integer votos) {
        this.nome = nome;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome() + " " + getVotos());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SistemaVotacao votos1 = (SistemaVotacao) o;
        return Objects.equals(nome, votos1.nome) && Objects.equals(votos, votos1.votos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, votos);
    }

}

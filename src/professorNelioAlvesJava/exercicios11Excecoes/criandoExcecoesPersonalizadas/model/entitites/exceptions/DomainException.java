package professorNelioAlvesJava.exercicios11Excecoes.criandoExcecoesPersonalizadas.model.entitites.exceptions;


//Quando uma classe é exceção tem que colocar o Exception no nome da classe
public class DomainException extends RuntimeException {

    //Versão de uma classe seriallasibol
    private static final long serialVersionUID = 1L;

    //colocando o super para passar a msg para o constutor da superclasse
    public DomainException(String msg) {
        super(msg);
    }


}

package professorNelioAlvesJava.exercicios16programacaoFuncionalEExpressaoLambda.interfaceFuncional.function.entities;

public class ProdutoFunction {

    private String nome;
    private Double precoo;

    public ProdutoFunction() {

    }

    public ProdutoFunction(String nome, Double precoo) {
        this.nome = nome;
        this.precoo = precoo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoo() {
        return precoo;
    }

    public void setPrecoo(Double precoo) {
        this.precoo = precoo;
    }

    //Reference method com método estático
    public static String staticUpdateNome(ProdutoFunction p) {
        return p.getNome().toUpperCase();
    }

    //Reference method com método não estático
    public String noStaticUpdateNome() {
        return getNome().toUpperCase();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getNome() + ", R$ " + getPrecoo());
        return sb.toString();
    }
}

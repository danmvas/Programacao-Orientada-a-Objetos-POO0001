public class Cidade {

    private String nome;
    private int populacao;
    private int casosCOVID;

    public Cidade() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getCasosCOVID() {
        return casosCOVID;
    }

    public void setCasosCOVID(int casosCOVID) {
        this.casosCOVID = casosCOVID;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" + "Populacao: " + this.populacao + "\n" + "N. casos COVID: "
                + this.casosCOVID;
    }

}
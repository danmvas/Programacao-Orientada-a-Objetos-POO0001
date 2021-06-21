public class Filme {

    private String nome;
    private int anoLancamento;
    private boolean cenaErotica; // false = nao ha cenas, true = ha cenas

    public Filme() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean getCenaErotica() {
        return cenaErotica;
    }

    public void setCenaErotica(boolean cenaErotica) {
        this.cenaErotica = cenaErotica;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" + "Ano de lancamento: " + this.anoLancamento + "Ha cenas eroticas? "
                + this.cenaErotica;
    }

}
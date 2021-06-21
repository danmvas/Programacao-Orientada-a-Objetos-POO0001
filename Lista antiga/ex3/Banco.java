public class Banco {

    private float comprimento;
    private float largura;
    private boolean couro;

    public Banco() {
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {

        StringBuilder banco = new StringBuilder();

        banco.append(comprimento);
        banco.append(" comprimento, ");
        banco.append(largura);
        banco.append(" largura, ");

        if (couro) {
            banco.append(" , eh de couro");
        }

        return banco.toString();

    }

}
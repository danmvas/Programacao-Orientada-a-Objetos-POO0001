public class Porta {

    private int quantidade;
    private float comprimento;
    private float largura;

    public Porta() {
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString(){

        StringBuilder porta = new stringbuilder;

        porta.append(quantidade);
        porta.append(" portas, com");
        porta.append(comprimento);
        porta.append(" cm de comprimento, e ");
        porta.append(largura);
        porta.append(" cm de largura");

        return porta.toString();

    }

}
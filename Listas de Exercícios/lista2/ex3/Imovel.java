public class Imovel {

    private float largura;
    private float comprimento;
    private float preco;

    public Imovel(){

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
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float areaTotal(float largura, float comprimento){
        return largura * comprimento;
    }

    public String toString() {
        return "Imovel [area total="+ areaTotal(largura, comprimento) +
        "comprimento=" + comprimento +
        ", largura=" + largura +
        ", preco=" + preco + "]";
    }
     
}

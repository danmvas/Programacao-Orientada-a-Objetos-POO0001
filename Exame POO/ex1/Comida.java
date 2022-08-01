package ex1;

public class Comida implements ITaxavel {

    private String nome;
    private double valor;

    public Comida()
    {

    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculaImposto() {
        return this.valor + this.valor * 0.15;
    }

}

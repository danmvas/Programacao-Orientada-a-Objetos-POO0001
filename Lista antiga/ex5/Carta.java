package ex5;

public class Carta {

    private Naipe naipe;
    private int numero;

    public Carta(Naipe naipe, int numero) {
        this.naipe = naipe;
        this.numero = numero;
    }

    public Naipe getNaipe() {
        return this.naipe;
    }

    public int getNumero() {
        return this.numero;
    }

}
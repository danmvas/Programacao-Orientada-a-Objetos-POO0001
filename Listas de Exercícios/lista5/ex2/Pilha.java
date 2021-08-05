package ex2;

import java.util.LinkedList;

public class Pilha<T> {

    private int topo;
    private int limite;
    private LinkedList<T> elementos;

    // primeiro que é colocado é o último que sai
    public Pilha(int limite) {
        this.limite = limite;
        this.topo = -1;
    }

    public void inserir(T objeto) throws PilhaCheiaException {
        if (getSize() + 1 <= limite) {
            elementos.add(objeto);
            topo++;
        } else {
            throw new PilhaCheiaException("Pilha cheia");
        }
    }

    public T remover() {
        if (topo >= 0) {
            topo--;
            return elementos.pop();
        }
    }

    public int getSize() {
        return elementos.size();
    }

}
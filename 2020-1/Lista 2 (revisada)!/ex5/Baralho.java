import java.util.Random;
package ex5;

public class Baralho {

    private int numeroDeCartas;
    private Carta[] baralho;
    private int topoPilha;

    public Baralho(int n) {
        this.numeroDeCartas = numeroDeCartas;
        this.baralho = new Carta[n];
    }

    public Carta[] getBaralho() {
        return this.baralho;
    }

    public boolean adicionarCarta(Carta c) {
        if (topoPilha < numeroDeCartas) {
            baralho[topoPilha] = c;
            topoPilha++;
            return true;
        } else {
            return false;
        }
    }

    public Carta tirarCarta(int a) {
        if (a < topoPilha) {
            Carta c = cartas[a];

            for (int i = a; i < topo - 1; i++) {
                cartas[i] = cartas[i + 1];
            }
            topoPilha--;
            cartas[topoPilha] = null;

            return c;
        }
        return null;
    }

    public void embaralhar() {
        Random aleatorio = new Random();
        Carta[] baralhoAuxiliar = new Carta[n];
        int topoAuxiliar = 0;

        while (topoPilha != 0) {
            int posicaoAleatoria = random.nextInt(topoPilha);
            baralhoAuxiliar[topoAuxiliar] = tirarCarta(posicaoAleatoria);
            topoAuxiliar++;
        }

        this.topoPilha = topoAuxiliar;
        this.baralho = baralhoAuxiliar;
    }

}
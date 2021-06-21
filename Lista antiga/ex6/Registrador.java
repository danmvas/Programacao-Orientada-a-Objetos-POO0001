package ex6;

public class Registrador {

    private boolean[] bitsSistema = new boolean[8];

    public boolean[] getBitsSistema() {
        return bitsSistema;
    }

    public void setBitsSistema(boolean[] bitsSistema) {
        this.bitsSistema = bitsSistema;
    }

    public void posicaoEspecifica(int a, boolean bit) {
        if (a < 8) { // nao ultrapassar limite máximo do array
            return this.bit[a];
        }
        return false;
    }

    public String toString() {

        StrinBuilder transformacaoString = new StringBuilder();

        for (boolean bit : bitsSistema) {
            if (bit) {
                transformacaoString.append("1 ");
            } else {
                transformacaoString.append("0 ");
            }
        }
        return transformacaoString.toString();

    }

}

package ex6;

public class CPU {

    private Registrador[] arrayRegistradores = new Registrador[8];
    private int topoPilha = 0;

    public boolean adicionarRegistrador(Registrador r) {
        if (topoPilha < 8) {
            registradores[topoPilha] = r;
            topo++;
            return true;
        } else {
            return false;
        }
    }

    public Registrador[] getArrayRegistradores() { // método get para o array
        return this.arrayRegistradores;
    }

    public Registrador operacaoOu(Registrador r1, Registrador r2) {

        Registrador rAuxiliar = new Registrador();

        for (int i = 0; i < 8; i++) {
            if (r1.getBitsSistema(i) || r2.getBitsSistema(i)) {
                rAuxiliar.setBitsSistema(i, true);
            } else
                rAuxiliar.setBitsSistema(i, false);
        }
        return rAuxiliar;
    }

    public Registrador operacaoE(Registrador r1, Registrador r2) {

        Registrador rAuxiliar = new Registrador();

        for (int i = 0; i < 8; i++) {
            if (r1.getBitsSistema(i) && r2.getBitsSistema(i)) {
                rAuxiliar.setBitsSistema(i, true);
            } else
                rAuxiliar.setBitsSistema(i, false);
        }
        return rAuxiliar;
    }

}
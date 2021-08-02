package ex1;

public class Multiplicacao extends Soma {

    public int executar(int valor1, int valor2) {
        Soma soma = new Soma();
        int cont = 0;

        for (int i = 0; i < valor2; i++){
            cont = soma.executar(valor1, valor1);
        }

        return cont;
    }
    
}

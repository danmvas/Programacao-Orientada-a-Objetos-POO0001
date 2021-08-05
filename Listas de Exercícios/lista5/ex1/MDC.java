package ex1;

public class MDC implements IOperacaoInteira {

    public int executar(int valor1, int valor2) {
        int gcd = 1;
        for (int i = 1; i <= valor1 && i <= valor2; i++) {
            if (valor1 % i == 0 && valor2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

}
package ex1;

public class Mod implements IOperacaoInteira {
    
    public int executar(int valor1, int valor2) {
        if (valor1 == valor2){
            return 1;
        }
        
        else if(valor1 > valor2){
            return (valor1 - valor2 * (valor1 / valor2));
        }
        
        else {
            return (valor2 - valor1 * (valor2 / valor1));
        }
    }
    
}

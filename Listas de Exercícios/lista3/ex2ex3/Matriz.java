package ex2ex3;

public class Matriz<T> {
    
    //n = num linhas; m = num colunas
    public Matriz(int n, int m){
        
    }

    public boolean set (T objeto, int i, int j){
        //colocar o objeto na posição i, j da matriz e retornar True
    }

    public T get (int i, int j){
        //retornar o objeto na posição i, j da matriz
    }

    public List<T> getLinha (int linha){
        //retornar lista contendo elementos presentes na linha "linha"
    }

    public List<T> getColuna (int coluna){
        //retornar coluna contendo elementos presentes na coluna "coluna"
    }

    public List<T> getElementosQuadrante (Quadrante quadrante){
        //retornar lista contendo elementos presentes no quadrante "quadrante"
    }

    public int menorElemento(Matriz matriz){
        //retorna o menor elemento de toooooooda a matriz
    }

}

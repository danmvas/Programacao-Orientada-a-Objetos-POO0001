package ex3;

public enum Qualidade {
    
    A(240), B(360), C(720), D(1024);

    public int valorQualidade;

    Qualidade(int qualidade){
        valorQualidade = qualidade;
    }

}

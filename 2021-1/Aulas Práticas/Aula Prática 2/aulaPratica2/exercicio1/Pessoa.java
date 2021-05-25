package aulaPratica2.exercicio1;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    private float massa;

    public Pessoa(){

    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getMassa() {
        return massa;
    }
    
    public void setMassa(float massa) {
        this.massa = massa;
    }
 
    public float calculaIMC(){
        return this.massa / (this.altura * this.altura);
    }

}
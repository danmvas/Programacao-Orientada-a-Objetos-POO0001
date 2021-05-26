package exercicio1;

public class Grupo {

    private Pessoa[] pessoas = new Pessoa[6];
    private int numeroPessoas = 0;

    public Grupo(){

    }

    public Pessoa[] getPessoas(){
        return this.pessoas;
    }

    public void setPessoa(Pessoa p){
        if (this.numeroPessoas < 6){
            pessoas[this.numeroPessoas] = p;
            this.numeroPessoas++;
        }
    }

    public void ordena(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(this.pessoas[j].calculaIMC() > this.pessoas[i].calculaIMC()){
                    Pessoa aux = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = aux;
                }
            }
        }
    }
    
}
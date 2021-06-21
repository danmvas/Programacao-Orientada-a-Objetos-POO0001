package dados;

import java.util.Arrays;

public class Veterinario {

    private String nome;
    private int salario;
    private Endereco endereco;
    private Animal animais[];
    private int quantidadeAnimais = 0;

    public Veterinario(int tamAnimais){
        animais = new Animal[tamAnimais];
    }

    public void addAanimal(Animal animal){
        if(quantidadeAnimais < animais.length){
            animais[quantidadeAnimais] = animal;
            quantidadeAnimais++;
        }

        else
            System.out.println("Nao foi possivel inserir o animal. O array ja esta em sua capacidade máxima.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Animal[] getAnimais() {
        return animais;
    }
    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public String toString() {
        return "Veterinario [animais=" + Arrays.toString(animais) + ", endereco=" + endereco + ", nome=" + nome
                + ", quantiadeAnimais=" + quantidadeAnimais + ", salario=" + salario + "]";
    }
    
}

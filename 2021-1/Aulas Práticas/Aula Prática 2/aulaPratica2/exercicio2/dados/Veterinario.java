package dados;

import java.util.Arrays;

public class Veterinario {

    private String nome;
    private int salario;
    private Endereco endereco;
    private Animal animais[];
    private int quantidadeAnimais;

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
    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public String toString() {
        return "Veterinario [animais=" + Arrays.toString(animais) + ", endereco=" + endereco + ", nome=" + nome
                + ", quantiadeAnimais=" + quantidadeAnimais + ", salario=" + salario + "]";
    }
    
}

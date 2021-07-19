class Pessoa {

    private String nome;
    private int idade;
    private int rg;

    public Pessoa() {
    }

    public int getRg() {
        return this.rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n" + "RG: " + this.rg;
    }

}
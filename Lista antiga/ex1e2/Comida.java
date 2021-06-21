public class Comida {

    private int calorias;
    private String nome;
    private boolean ehCheiroso;

    public Comida() {

    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getCalorias() {
        return this.calorias;
    }

    public void setEhCheiroso(boolean ehCheiroso) {
        this.ehCheiroso = ehCheiroso;
    }

    public boolean getEhCheiroso() {
        return this.ehCheiroso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" + "Calorias: " + this.calorias + "\n" + "Eh cheiroso? " + this.ehCheiroso;
    }

}
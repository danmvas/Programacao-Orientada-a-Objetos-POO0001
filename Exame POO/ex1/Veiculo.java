package ex1;

public class Veiculo implements ITaxavel {

    private String placa;
    private int ano;

    public Veiculo(){

    }
    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double calculaImposto() {
        int preco;
        
        if (this.ano < 200) {
            preco = 250;
        } else {
            preco = 450;
        }

        return preco;
    }

}

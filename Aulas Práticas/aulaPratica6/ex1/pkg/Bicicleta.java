package ex1.pkg;

public class Bicicleta extends Veiculo {

    private int numeroMarchas;

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public  String  info()  {
        return  "\n Bicicleta\n" +
        "Cor :  " + this.getCor () + "\n" +
        "Numero de  marchas:  "+ this.numeroMarchas + "\n" ;
    }
    
}

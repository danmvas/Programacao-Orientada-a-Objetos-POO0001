package ex4;

public class Cor {

    private int red;
    private int green;
    private int blue;
    private String nome;

    public Cor(int red, int blue, int green, String nome) {
        this.red = red;
        this.blue = blue;
        this.green = green;
        this.nome = nome;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object cor) {
        if(cor instanceof Cor){
            return this.red == ((Cor) cor).getRed() && this.green == ((Cor) cor).getGreen()&& this.blue == ((Cor) cor).getBlue();
        }
        return false;
    }

}
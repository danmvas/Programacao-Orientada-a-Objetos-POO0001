package ex2;

public class Losango extends FormaGeometrica {
    
    private int setD;
    private int setd;

    //diagonal maior
    public void setD(int medida1){
        this.setD = medida1;
    }

    //diagonal menor
    public void setd(int medida2){
        this.setd = medida2;
    }

    public int calcularArea(){
        return (setD + setd)/2;
    }

    public int calcularPerimetro(){
        return (int) (4 * Math.sqrt(setD^2/4 + setd^2/4));
    }

    public String toString(){
        return "Diagonal maior: " + setD + "\n" +
        "Diagonal menor: " + setd + "\n" +
        "Area: " + calcularArea() + "\n" +
        "Perimetro: " + calcularPerimetro() + "\n";
    }

}

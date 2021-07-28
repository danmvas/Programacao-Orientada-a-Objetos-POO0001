package ex2;

public class Trapezio extends FormaGeometrica {

    private int baseMaior;
    private int baseMenor;
    private int altura;
    
    public void setBaseMaior(int medida1) {
        this.baseMaior = medida1;
    }

    public void setBaseMenor(int medida2) {
        this.baseMenor = medida2;
    }

    public void setAltura(int valor){
        valor = this.altura;
    }

    public int calcularArea(){
        return ((baseMaior-baseMenor)*altura)/2;
    }

    public int calcularPerimetro(){
        return (int) (baseMaior+baseMenor+2*(Math.sqrt(altura^2+((baseMaior-baseMenor)/2))));
    }

    public String toString(){
        return "Base maior: " + baseMaior + "\n" +
               "Base menor: " + baseMenor + "\n" +
               "Altura: " + altura + "\n" +
               "Area: " + calcularArea() + "\n" +
               "Perimetro: " + calcularPerimetro() + "\n";
    }

}

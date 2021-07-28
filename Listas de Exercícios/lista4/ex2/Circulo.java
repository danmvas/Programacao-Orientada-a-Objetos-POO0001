package ex2;

public class Circulo extends FormaGeometrica {

    private int raio;

    public void setRaio(int medida1){
        this.raio = medida1;
    }

    public int calcularArea(){
        return (int) Math.PI *raio^2; 
    }

    public int calcularPerimetro(){
        return (int) Math.PI * raio*2;
    }

    public String toString(){
        return "Raio: " + raio + "\n" +
        "Diametro: " + raio*2 + "\n" +
        "Area: " + calcularArea() + "\n" +
        "Perimetro: " + calcularPerimetro() + "\n";
    }
    
}

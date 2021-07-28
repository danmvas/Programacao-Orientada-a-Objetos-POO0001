package ex2;

public abstract class FormaGeometrica {

    private int medida1;
    private int medida2;

    public int getMedida1() {
        return medida1;
    }

    public void setMedida1(int medida1) {
        this.medida1 = medida1;
    }

    public int getMedida2() {
        return medida2;
    }

    public void setMedida2(int medida2) {
        this.medida2 = medida2;
    }

    public abstract int calcularArea();

    public abstract int calcularPerimetro();
    
}

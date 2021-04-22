public class Roda {

    private int aro;
    private boolean estepe;
    private String marca;

    public Roda() {
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getEstepe() {
        return estepe;
    }

    public void setEstepe(Boolean estepe) {
        this.estepe = estepe;
    }

    public String toString() {

        StringBuilder roda = new StringBuilder();

        roda.append("aro ");
        roda.append(aro);
        roda.append(" - ");
        roda.append(marca);

        if (estepe) {
            roda.append(" - possui estepe");
        }

        return roda.toString();

    }

}
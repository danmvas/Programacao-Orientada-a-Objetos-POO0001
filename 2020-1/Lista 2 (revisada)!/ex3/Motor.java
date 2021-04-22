public class Motor {

    private int cavalos;
    private boolean automatico;
    private Combustivel combustivel;

    public Motor() {
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public boolean automatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public String toString() {

        StringBuilder motor = new stringbuilder();
        motor.append(cavalos);
        motor.append(" cavalos -");
        motor.append("tipo de combustivel: ");
        motor.append(combustivel);

        if (automatico) {
            motor.append("- eh automatico");
        }

        return motor.toString();

    }

}
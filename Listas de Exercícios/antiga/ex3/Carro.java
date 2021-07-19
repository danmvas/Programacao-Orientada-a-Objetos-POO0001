package ex3;

public class Carro {

    private Combustivel tipoCombustivel;
    private Porta[] portas = new Porta[4];
    private Roda[] rodas = new Roda[4];
    private Motor[] motor = new Motor[1];
    private Banco[] bancos = new Banco[5];

    public Carro() {
    }

    public Porta[] getPortas() {
        return portas;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }

    public Banco[] getBancos() {
        return bancos;
    }

    public void setBancos(Banco[] bancos) {
        this.bancos = bancos;
    }

    public Combustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(Combustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Motor[] getMotor() {
        return motor;
    }

    public void setMotor(Motor[] motor) {
        this.motor = motor;
    }

    public Roda[] getRodas() {
        return rodas;
    }

    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

}
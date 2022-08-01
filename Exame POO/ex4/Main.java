package ex4;

public class Main {

    public static void main(String[] args) {

        Cor azul = new Cor(0,0,255,"azul");
        Cor vermelho = new Cor(255,0,0,"vermelho");
        Cor amarelo = new Cor(255,255,0,"amarelo");
        Cor magenta = new Cor(255,0,255,"magenta");
        Cor branco = new Cor(255, 255, 255, "branco");

        PaletaCores paleta = new PaletaCores();
        try {
            paleta.adiconarCor(azul);
            paleta.adiconarCor(vermelho);
            paleta.adiconarCor(amarelo);
            paleta.adiconarCor(magenta);
            paleta.adiconarCor(branco);
            paleta.adiconarCor(branco);
        }      
        catch (Exception e) {
            System.out.println(e);
        }
            for (Cor c :paleta.filtrar()) {
                System.out.println(c.getnome());
        } 
    }
    
}
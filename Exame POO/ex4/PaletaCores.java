package ex4;

import java.util.ArrayList;
import java.util.List;

public class PaletaCores {

    private List<Cor> cores = new ArrayList<>();

    public void adiconarCor (Cor cor) throws Exception{

            for (Cor c : cores){
                if (c.equals(cor)){
                    throw new Exception("A cor " + cor.getRed() + " " + cor.getGreen() + " " + cor.getBlue() + " ja existe");
                }
            }
            cores.add(cor);
    }

    // retorna todas as cores com this.blue == 0
    public List<Cor> filtrar(){
        List<Cor> listaRetorno = new ArrayList<>();
        for (Cor c : cores) {
            if(c.getBlue() == 0)
            {
                listaRetorno.add(c);
            }
        }
        
        return listaRetorno;
    }

}
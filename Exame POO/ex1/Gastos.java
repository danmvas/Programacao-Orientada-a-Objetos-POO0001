package ex1;

import java.util.List;

public class Gastos {

    public void exibirGastos(List<ITaxavel> itens){
        for(int i=0; i<itens.size();i++)
        {
            System.out.println("Produto "+(i+1));
            System.out.println("   Tipo: ");
            System.out.println("   Valor: ");
            System.out.println("   Imposto: "+itens.get(i).calculaImposto());

        }

    }
    
}

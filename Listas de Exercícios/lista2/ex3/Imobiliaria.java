package ex3;
import java.util.Scanner;

public class Imobiliaria {

    private String nome;
    Scanner leitor = new Scanner(System.in);

    int numeroImoveisAVenda = 0;
    private Imovel imoveis = new Imovel[numeroImoveisAVenda];
    
    public Imovel[] filtrarPorArea(float x){
        for(int i = 0; i < numeroImoveisAVenda; i++){
            if (imoveis[i].areaTotal(imoveis[i].getLargura, imoveis[i].getComprimento) > x)
                return imoveis[i].toString();

            else continue;
        }
    }

    public Imovel adicionarImovel(Imovel imovelNovo){
        System.out.println("Largura: ");
        float larg = leitor.nextFloat();
        imovelNovo.setLargura(larg);

        System.out.println("Altura: ");
        float altu = leitor.nextFloat();
        imovelNovo.setLargura(altu);

        System.out.println("Preço: ");
        float prec = leitor.nextFloat();
        imovelNovo.setLargura(prec);
    }

    public String toString(){
        if (numeroImoveisAVenda > 0) {
            for(int i = 0; i < numeroImoveisAVenda; i++)
                System.out.println(imoveis[i].toString());
            
            System.out.println("Deseja filtrar os imoveis visualizados? 1- Sim / 2 - Nao");
            int opcao = leitor.nextInt();

            if (opcao == 1){
                System.out.println("Digite o mínimo de tamanho que quer visualizar:");
                int tam = leitor.nextInt();
                filtrarPorArea(tam);
            }

            else break;
        }

        else System.out.println("Nao ha imoveis a venda.");

    }
    
}

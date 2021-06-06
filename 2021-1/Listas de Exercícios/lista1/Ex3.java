import java.util.Scanner;

public class Ex3 {

    public static int buscaMaior (int vetor[], int maiorAtual, int indice) {
        
        //estabelecendo condição de parada
        if(indice == vetor.length) return maiorAtual;

        return buscaMaior(vetor, Math.max(vetor[indice], maiorAtual), indice+1);
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int v = 0;

        System.out.println("Qual o tamanho do vetor?");
        v = leitor.nextInt();
        int vetor[] = new int[v];

        System.out.println("Digite os valores do valor: ");
        for(int j = 0; j < v; j++){
            vetor[j] = leitor.nextInt();
        }

        System.out.println("O maior valor do vetor eh: " + buscaMaior(vetor, vetor[0], 0));

        leitor.close();
    }

}

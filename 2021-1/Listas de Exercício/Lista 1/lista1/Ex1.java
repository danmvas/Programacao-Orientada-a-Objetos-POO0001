package lista1;
import java.util.Scanner;

public class Ex1{

    public static boolean ehPrimo(int n){
        if (n < 0)
            return false;

        if (n == 1)
            return true;

        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Defina o tamanho do vetor: ");
        int tam = leitor.nextInt();
        int[] valores = new int[tam];
        
        System.out.println("Defina os valores (inteiros) do vetor: ");
        for (int i = 0; i < tam; i++)
            valores[i] = leitor.nextInt();

        int soma = 0;
        int menor = valores[0];
        int maior = valores[0];
        int media = 0;
        int somaPrimos = 0;

        for (int i = 0; i < tam; i++){
            soma = soma + valores[i];

            if(menor > valores[i])
                menor = valores[i];

            if(maior < valores[i])
                maior = valores[i];

            if(ehPrimo(valores[i]) == true)
                somaPrimos = somaPrimos + valores[i];

        }

        media = soma / tam;
  
        System.out.println("Soma: " + soma);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);
        System.out.println("Soma dos primos: " + somaPrimos);
        leitor.close();
    }
}
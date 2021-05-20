//Escreva um programa em Java, que leia o nome e a idade de 3 pessoas
//e exiba-os no console. É obrigatório o uso de array.

package exercicios;
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];
        
        for (int i = 0; i < 3; i++){
            nomes[i] = leitor.next();
            idades[i] = leitor.nextInt();
        }

        for (int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
            System.out.println(idades[i] + "\n");
        }

        leitor.close();
    }

}

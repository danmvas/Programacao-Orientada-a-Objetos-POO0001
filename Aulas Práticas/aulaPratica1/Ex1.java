package aulaPratica1;
import java.util.Scanner;

public class Ex1{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] valores = new int[5];
        float media = 0;

        for (int i = 0; i < 5; i++){
            valores[i] = leitor.nextInt();
            media += valores[i];
        }

        System.out.println("Media = " + media / 5);

        leitor.close();
    }   
}

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random numero = new Random();

        System.out.println("Defina altura e largura das matrizes: ");
        int n = leitor.nextInt();
        int m = leitor.nextInt();

        int[][] m1 = new int[n][m];
        int[][] m2 = new int[n][m];
        int[][] m3 = new int[n][m];
        int[][] m4 = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                m1[i][j] = numero.nextInt();
                m2[i][j] = numero.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (m1[i][j] > m2[i][j])
                    m3[i][j] = m1[i][j];

                else
                    m3[i][j] = m2[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (i <= j)
                    m4[i][j] = 0;

                else{
                    if(m1[i][j] < m2[i][j])
                        m4[i][j] = m1[i][j];

                    else
                        m4[i][j] = m2[i][j];
                } 
            }
        }

        System.out.println();
        System.out.println("===========================");
        System.out.println("Matriz m3:\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===========================");
        System.out.println("Matriz m4:\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(m4[i][j] + " ");
            }
            System.out.println();
        }

    leitor.close();
    }
}

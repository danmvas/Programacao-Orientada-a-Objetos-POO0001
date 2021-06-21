import java.util.Scanner;
import java.util.Arrays;

public class Ex6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a primeira String: ");
        String string1 = leitor.nextLine();
        String string1min = string1.toLowerCase().replace(" ", "");

        System.out.println("Insira a segunda String: ");
        String string2 = leitor.nextLine();
        String string2min = string2.toLowerCase().replace(" ", "");

        String letras = "";

        for(int i=0; i < string1min.length(); i++){
            Character ci = string1min.charAt(i);

            if(!letras.contains(ci.toString())){
                for(int j = 0; j < string2min.length(); j++){
                char cj = string2min.charAt(j);
                if (ci == cj){
                    letras += ci;
                    break;
                }
            }
        }
        }

        char[] letrasOrganizadas = letras.toCharArray();
        Arrays.sort(letrasOrganizadas);

        for (int k = 0; k < letras.length(); k++)
            System.out.println("As letras presentes em ambas as Strings sao: " + letrasOrganizadas[k]);

        leitor.close();
    }

}

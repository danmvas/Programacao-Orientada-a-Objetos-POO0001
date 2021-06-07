import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a primeira String:");
        String string1 = leitor.nextLine();
        String string1min = string1.toLowerCase();

        System.out.println("Insira a segunda String");
        String string2 = leitor.nextLine();
        String string2min = string2.toLowerCase();

        Character[] letras = new Character[26];

        for(int i=0; i < string1.length(); i++){
            char ci = string1.charAt(i);

            for(int j = 0; j < string2.lenght(); j++){
                char cj = string1.charAt(j);
                if (ci == cj) 
            }
        }

        for (int k = 0; k < letras.length(); k++)
            System.out.println("As letras presentes em ambas as Strings sao: " + letras[k]);

        leitor.close();
    }

}

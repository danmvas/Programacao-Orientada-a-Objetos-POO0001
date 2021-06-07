import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contaVogal = 0, contaConsoante = 0;

        System.out.println("Digite uma frase (sem acento ou pontuacao): ");
        String fraseUsuario = leitor.nextLine();

        //retira espaços e deixa tudo em minúsculo pra poder fazer a comparação do palíndromo!
        String fraseUsuarioSemNada = fraseUsuario.toLowerCase().replace(" ", "");

        //literalmente só revertendo
        String fraseUsuarioRevertida = new StringBuilder(fraseUsuario).reverse().toString();

        if (fraseUsuario.equals(fraseUsuarioRevertida))
            System.out.println(fraseUsuarioRevertida + " eh um palindromo da string original.");

        else System.out.println(fraseUsuarioRevertida + " nao eh um palindromo da string original.");

        for (int i = 0 ; i < fraseUsuarioSemNada.length(); i++){

            char c = fraseUsuarioSemNada.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contaVogal ++;
            else contaConsoante++;
        }

        System.out.println("n° vogais: " + contaVogal);
        System.out.println("n° consoantes: " + contaConsoante);
        System.out.println("A string invertida eh: '" + fraseUsuarioRevertida + "'");

        leitor.close();
    }
    
}
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public Principal() {

    }

    public static List<Integer> tabuada(int n) {
        List<Integer> tabuada = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            tabuada.add(i * n);
        }
        return tabuada;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> todasAsTabuadas = new HashMap<Integer, List<Integer>>();
        // cria o Map, com a chave sendo um numero inteiro e os valores uma lista de
        // inteiros

        for (int i = 1; i <= 10; i++) {
            todasAsTabuadas.put(i, tabuada(i));
        } // adiciona dentro do map a tabuada de 1 a 10, para cada valor inteiro, usando a
          // função antes criada

        todasAsTabuadas.forEach( // executa ação para cada para (chave, valor)
                (chave, tabuada) -> {
                    System.out.print("Tabuada do " + chave + ": ");
                    for (int x : tabuada) {
                        System.out.print(x + " ");
                    }
                    System.out.print("\n");
                }); // imprimindo cada valor (tabuada), para cada inteiro do map (chave)

    }

}
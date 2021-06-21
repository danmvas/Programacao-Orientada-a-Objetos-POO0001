package ex4;
import java.util.Random;

public class Sorteador {
    
    private Pessoa pessoa = new Pessoa[10]; //n = 10
    Random random = new Random();

    public Pessoa sortearProximo(){

        //numero aleatorio de 0 a 9
        //ou seja, a posicao que queremos eliminar do vetor
        int posicaoAleatoria = random.nextInt(9);

        System.out.println("A pessoa sorteada foi:" + "\n" +
        pessoa[posicaoAleatoria].getNome + "\n" +
        pessoa[posicaoAleatoria].getIdade + "\n" +
        pessoa[posicaoAleatoria].getCpf + "\n");

        //eliminando o elemento na posicao gerada
        pessoa = ArrayUtils.removeElement(pessoa, posicaoAleatoria);

    }

}

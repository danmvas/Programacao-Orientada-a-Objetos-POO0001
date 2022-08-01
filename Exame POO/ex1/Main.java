package ex1;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<ITaxavel> itens = new ArrayList<ITaxavel>();

        Comida c1 = new Comida();
        Comida c2 = new Comida();

        c1.setNome("batata");
        c1.setValor(2);

        c2.setNome("bife de segunda");
        c2.setValor(10000);

        Filme f1 = new Filme();
        Filme f2 = new Filme();

        f1.setNome("Filme: O filme");
        f1.setDuracao(60);

        f2.setNome("Insira nome aqui");
        f2.setDuracao(120);

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.setAno(1999);
        v1.setPlaca("sdjjkkjdsf1iu45");

        v2.setAno(2999);
        v2.setPlaca("hkjsdjhkfhjs248");

        itens.add(0, c1);
        itens.add(1, c2);
        itens.add(2, f1);
        itens.add(3, f2);
        itens.add(4, v1);
        itens.add(5, v2);

        Gastos gastos = new Gastos();

        gastos.exibirGastos(itens);
    }

}

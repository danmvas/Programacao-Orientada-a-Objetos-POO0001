package negocio;

import dados.Contato;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ListaTelefonica {

    private Map<Character, List<Contato>> contatos = new HasMap<Character, List<Contato>>();

    public ListaTelefonica() {

        for(char i = 65; i < 91; i++){

            List<Contato> listaMaiuscula = new LinkedList<Contato>();
            contatos.put(i, listaMaiuscula);

        }

        for(char j = 97; j < 123; j++){

            List<Contato> listaMinuscula = new LinkedList<Contato>>();
            contatos.put(j, listaMinuscula);

        }
        
    }

    public void adicionarContato(Contato contato) {
        String nome = contato.getNome();
        contatos.get(nome.charAt(0)).add(contato);
    }

    public void removerContato(Contato contato) {
        String nome = contato.getNome();
        contatos.get(nome.charAt(0)).remove(contato);
    }

    public List<Contato> buscarContatos(char letra) {
        return contatos.get(letra);
    } // busca os contatos com a letra inicial

    public Map<Character, List<Contato>> buscarContatos() {
        return contatos;
    } //

}
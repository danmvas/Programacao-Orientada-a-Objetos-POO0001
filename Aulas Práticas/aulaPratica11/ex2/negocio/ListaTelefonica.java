package ex2.negocio;

import java.util.List;
import java.util.Map;

import ex2.dados.Contato;
import ex2.exceptions.*;

public class ListaTelefonica {

    public void adicionarContato(Contato contato)
            throws ContatojaCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {

    }

    public void removerContato(Contato contato)
            throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {

    }

    public List<Contato> buscarContatos(char letra) throws ErroNaLeituraException {
        return null;

    }

    public Map<Character, List<Contato>> buscarContatos() throws ErroNaLeituraException {
        return null;

    }

}

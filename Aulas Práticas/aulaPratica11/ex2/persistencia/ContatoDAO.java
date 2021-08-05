package ex2.persistencia;

import java.util.List;
import java.util.Map;

import ex2.dados.Contato;
import ex2.exceptions.ContatojaCadastradoException;
import ex2.exceptions.*;

public class ContatoDAO {

    public void insert(Contato contato)
            throws ContatojaCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {
        List<Contato> contatos = arquivoContatoDAO.lerContatos();

        if (!contatos.contains(contato)) {
            contatos.add(contato);
            arquivoContatoDAO.salvarContatos(contatos);
        } else {
            throw new ContatojaCadastradoException();
        }
    }

    public void delete(Contato contato)
            throws ContatoNaoCadastradoException, ErroNaLeituraException, ErroNaGravacaoException {

    }

    public Map<Character, List<Contato>> getAll() throws ErroNaLeituraException {
        return null;

    }

}

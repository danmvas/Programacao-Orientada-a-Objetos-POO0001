package ex2.exceptions;

public class ContatoNaoCadastradoException extends Exception {

    public ContatoNaoCadastradoException() {
        super("Contato nao cadastrado");
    }

}

package ex1.exceptions;

public class SelectException extends Exception {

    SelectException() {
    }

    public SelectException(String mensagem) {
        super(mensagem);
    }

}

package ex1.exceptions;

public class DeleteException extends Exception {

    DeleteException() {
    }

    public DeleteException(String mensagem) {
        super(mensagem);
    }

}

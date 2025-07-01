package projetos.dio.Exceptions;

public class InvalidNumbersOrderException extends RuntimeException {
    public InvalidNumbersOrderException(String mensagem) {
        super(mensagem);
    }
}

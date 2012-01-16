package returncodes.demo2.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */
public class PasswordIncorrectException extends Exception {
    public PasswordIncorrectException() {
    }

    public PasswordIncorrectException(String s) {
        super(s);
    }

    public PasswordIncorrectException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public PasswordIncorrectException(Throwable throwable) {
        super(throwable);
    }
}

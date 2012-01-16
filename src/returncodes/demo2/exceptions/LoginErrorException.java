package returncodes.demo2.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
public class LoginErrorException extends Throwable {
    public LoginErrorException() {
    }

    public LoginErrorException(String s) {
        super(s);
    }

    public LoginErrorException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public LoginErrorException(Throwable throwable) {
        super(throwable);
    }
}

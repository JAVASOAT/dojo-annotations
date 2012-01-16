package returncodes.demo1.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
    }

    public UserNotFoundException(String s) {
        super(s);
    }

    public UserNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UserNotFoundException(Throwable throwable) {
        super(throwable);
    }
}

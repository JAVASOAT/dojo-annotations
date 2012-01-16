package patterns.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
public class UneException extends Exception {

    public UneException() {
    }

    public UneException(String s) {
        super(s);
    }

    public UneException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UneException(Throwable throwable) {
        super(throwable);
    }
}

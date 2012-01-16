package returncodes.demo3.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */
public class DbOutOfOrderException extends RuntimeException {
    public DbOutOfOrderException() {
    }

    public DbOutOfOrderException(String s) {
        super(s);
    }

    public DbOutOfOrderException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DbOutOfOrderException(Throwable throwable) {
        super(throwable);
    }
}

package demo1.exceptions;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class MyAppRuntimeException extends RuntimeException {
    public MyAppRuntimeException() {
    }

    public MyAppRuntimeException(String s) {
        super(s);
    }

    public MyAppRuntimeException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public MyAppRuntimeException(Throwable throwable) {
        super(throwable);
    }
}

package patterns;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class BaseClass {
    protected void methodWithAnException() throws SQLException {
        throw new IllegalArgumentException();
    }

    protected void logIt(String error, Throwable e){

    }

    protected void logIt(String message) {
    }

    protected boolean check() {
        return true;
    }

    protected void methodWithoutAnException() {

    }
}

package patterns;

import patterns.exceptions.LoginFormatException;
import patterns.exceptions.UneException;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
public class Patterns extends BaseClass {

    public void translation() throws UneException {
        try {
            methodWithAnException();
        } catch (SQLException e) {
            throw new UneException("Pb avec l'acces aux données",e);
        }
    }

    public void validation() {
        if(check()) {
            methodWithoutAnException();
        }
    }

    public void javaExceptionAndFailFastAndAtomicity(final String arg) {
        if(arg == null) {
            throw new NullPointerException("Beware arg cannot be null!!");
        }

        myattribute = "toto";

        if(!arg.startsWith("_")) {
            throw new IllegalArgumentException("Arg should start with an underscore!");
        }
    }
    
    public void exceptionAvecInfos(final String login) throws LoginFormatException {
        if(!login.startsWith("_")) {
            throw new LoginFormatException(login);
        }
    }
}

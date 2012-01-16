package returncodes.demo3.dao;

import demo1.exceptions.MyAppRuntimeException;
import returncodes.demo3.exceptions.DbOutOfOrderException;
import returncodes.demo3.exceptions.PasswordIncorrectException;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class LoginDao {
    

    public boolean isUsernameValid(final String userName) {
        return !userName.equalsIgnoreCase("invalidLogin");
    }

    public void doLoginExceptions(final String login, final String password) throws PasswordIncorrectException
    {
        if(login.equalsIgnoreCase("invalidLogin")) {
            throw new RuntimeException();
        }
        else if(login.equalsIgnoreCase("invalidPassword")) {
            throw new PasswordIncorrectException();
        } else if(login.equalsIgnoreCase("dbError")) {
            throw new DbOutOfOrderException();
        } else if(login.equalsIgnoreCase("sqlError")) {
            throw new MyAppRuntimeException(new SQLException());
        }


    }
}

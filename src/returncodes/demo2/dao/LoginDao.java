package returncodes.demo2.dao;

import returncodes.demo2.exceptions.DbOutOfOrderException;
import returncodes.demo2.exceptions.PasswordIncorrectException;
import returncodes.demo2.exceptions.UserNotFoundException;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class LoginDao {

    public void doLoginExceptions(final String login, final String password) throws UserNotFoundException, PasswordIncorrectException, DbOutOfOrderException, SQLException
    {
        if(login.equalsIgnoreCase("invalidLogin")) {
            throw new UserNotFoundException();
        } else if(login.equalsIgnoreCase("invalidPassword")) {
            throw new PasswordIncorrectException();
        } else if(login.equalsIgnoreCase("dbError")) {
            throw new DbOutOfOrderException();
        } else if(login.equalsIgnoreCase("sqlError")) {
            throw new SQLException();
        }
    }
}

package returncodes.demo2.business;

import returncodes.demo2.dao.LoginDao;
import returncodes.demo2.exceptions.DbOutOfOrderException;
import returncodes.demo2.exceptions.LoginErrorException;
import returncodes.demo2.exceptions.PasswordIncorrectException;
import returncodes.demo2.exceptions.UserNotFoundException;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */
public class LoginService {

    private LoginDao dao = new LoginDao();

    public void doLoginExceptions(final String login, final String password) throws LoginErrorException, PasswordIncorrectException, UserNotFoundException {
        try {
            dao.doLoginExceptions(login, password);
        } catch (DbOutOfOrderException e) {
            throw new LoginErrorException(e);
        } catch (SQLException e) {
            throw new LoginErrorException(e);
        }
    }
}

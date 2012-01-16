package returncodes.demo3.business;

import returncodes.demo3.dao.LoginDao;
import returncodes.demo3.exceptions.PasswordIncorrectException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */
public class LoginService {

    private LoginDao dao = new LoginDao();

    public boolean isUsernameValid(final String login) {
        return dao.isUsernameValid(login);
    }
    
    public void doLoginExceptions(final String login, final String password) throws PasswordIncorrectException {
        dao.doLoginExceptions(login, password);
    }
}

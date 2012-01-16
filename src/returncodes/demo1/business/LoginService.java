package returncodes.demo1.business;

import returncodes.demo1.dao.LoginDao;
import returncodes.demo1.exceptions.LoginErrorException;
import returncodes.demo1.exceptions.PasswordIncorrectException;
import returncodes.demo1.exceptions.UserNotFoundException;

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
        final int returnCode = dao.doLoginCodes(login, password);
        
        switch(returnCode) {
            case LoginDao.OK:
                return;
            case LoginDao.ERROR_DB:
            case LoginDao.ERROR_SQL:
                throw new LoginErrorException();
            case LoginDao.ERROR_INVALID_LOGIN:
                throw new UserNotFoundException();
            case LoginDao.ERROR_INVALID_PASSWORD:
                throw new PasswordIncorrectException();
            default:
                throw new LoginErrorException("WTF is this unknown code???");
        }
    }
}

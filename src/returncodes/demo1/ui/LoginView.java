package returncodes.demo1.ui;

import returncodes.demo1.business.LoginService;
import returncodes.demo1.exceptions.LoginErrorException;
import returncodes.demo1.exceptions.PasswordIncorrectException;
import returncodes.demo1.exceptions.UserNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public class LoginView {
    
    private LoginService service = new LoginService();
    
    public String doLogin(final String login, final String password) {
        try {
            service.doLoginExceptions(login, password);
            return "success";
        } catch (LoginErrorException e) {
            addError("outch, erreur technique...");
            return "error";
        } catch (PasswordIncorrectException e) {
            addError("Votre imot de passe n'est pas valide!");
            return "loginError";
        } catch (UserNotFoundException e) {
            addError("Votre identifiant n'est pas connu...");
            return "loginError";
        }
    }

    private void addError(String s) {
        //To change body of created methods use File | Settings | File Templates.
    }
}

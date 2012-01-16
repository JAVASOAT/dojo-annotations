package returncodes.demo3.ui;

import returncodes.demo3.business.LoginService;
import returncodes.demo3.exceptions.PasswordIncorrectException;

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
            if(!service.isUsernameValid(login)) {
                addError("Votre identifiant n'est pas connu...");
                return "loginError";
            }
            service.doLoginExceptions(login, password);
            return "success";
        } catch (PasswordIncorrectException e) {
            addError("Votre imot de passe n'est pas valide!");
            return "loginError";
        }     catch (RuntimeException e) {
    }

    private void addError(String s) {
        //To change body of created methods use File | Settings | File Templates.
    }
}

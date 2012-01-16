package patterns.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 12:17
 * To change this template use File | Settings | File Templates.
 */
public class LoginFormatException extends Exception {

    private String login;
    
    public LoginFormatException(String s) {
        this.login = s;
    }

    @Override
    public String getMessage() {
        return "Le login n'est pas bien formaté! La valeur est : " + login;
    }
}

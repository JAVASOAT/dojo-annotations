package returncodes.demo1.dao;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class LoginDao {


    public static final int ERROR_INVALID_LOGIN = -1;
    public static final int ERROR_INVALID_PASSWORD = -2;
    public static final int ERROR_DB = -3;
    public static final int ERROR_SQL = -4;
    public static final int OK = 0;

    public int doLoginCodes(final String login, final String password)
    {
        if(login.equalsIgnoreCase("invalidLogin")) {
            return ERROR_INVALID_LOGIN;
        } else if(login.equalsIgnoreCase("invalidPassword")) {
            return ERROR_INVALID_PASSWORD;
        } else if(login.equalsIgnoreCase("dbError")) {
            return ERROR_DB;
        } else if(login.equalsIgnoreCase("sqlError")) {
            return ERROR_SQL;
        }
        return OK;
    }
}

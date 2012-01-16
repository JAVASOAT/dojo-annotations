package returncodes.demo1.ui;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 */
public class LoginViewTest {

    @Test
    public void testDoLoginAllOk() throws Exception {
        final LoginView view = new LoginView();

        Assert.assertEquals("success",view.doLogin("ok",""));
    }

    @Test
    public void testDoLoginInvalidLogin() throws Exception {
        final LoginView view = new LoginView();

        Assert.assertEquals("loginError",view.doLogin("invalidLogin",""));
    }

    @Test
    public void testDoLoginInvalidPAssword() throws Exception {
        final LoginView view = new LoginView();

        Assert.assertEquals("loginError",view.doLogin("invalidPassword",""));
    }

    @Test
    public void testDoLoginDbError() throws Exception {
        final LoginView view = new LoginView();

        Assert.assertEquals("error",view.doLogin("dbError",""));
    }

    @Test
    public void testDoLoginSQlError() throws Exception {
        final LoginView view = new LoginView();

        Assert.assertEquals("error",view.doLogin("sqlError",""));
    }

    @Test(expected = RuntimeException.class)
    public void testDoLoginUnexpected() throws Exception {
        final LoginView view = new LoginView();

        view.doLogin(null, "");
    }
}

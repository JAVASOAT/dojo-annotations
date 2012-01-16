package patterns;

import patterns.exceptions.*;

import java.io.*;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: mparisot
 * Date: 12/01/12
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
public class AntiPatterns extends BaseClass {

    public void taGueule() {
        try {
            methodWithAnException();
        } catch (SQLException e) {
            //Ah Ah!
        }
    }
    
    public void pokemon() {
        try {
            methodWithAnException();
        } catch (Exception e) {
            //je suis sympa je la log!
            logIt(e.getMessage(),e);
        }
    }
    
    public void beggaie() throws SQLException  {
        try {
            methodWithAnException();
        } catch (SQLException e) {
            logIt(e.getMessage(),e);
            throw e;
        }
    }

    /**
     * 
     * @throws UneException
     * @throws UneAutreException
     * @throws EncoreUneAUtreException
     * @throws CaCommenceABienFaireException
     * @throws CestBientotFiniException
     * @throws StopException
     * @throws JeVaisMePendreException
     */
    public void listeDeCourses() throws UneException, UneAutreException, EncoreUneAUtreException, CaCommenceABienFaireException, CestBientotFiniException, StopException, JeVaisMePendreException {

    }

    public void throwAnything() throws Exception {
        methodWithAnException();
    }

    public void whatHappened() {
        try {
            methodWithAnException();
        } catch (SQLException e) {
            // on ne sera jamais ce qui s'est passé!
            logIt(e.getMessage());
        }
    }
    
    public void amnesique() {
        try {
            methodWithAnException();
        } catch (SQLException e) {
            throw new RuntimeException("oublions le passé!",e);
        }
    }

    public void pasSiFinalQueCa() {
        Writer out = new OutputStreamWriter(new FileOutputStream("a.txt"), "UTF-8");
        Writer out2 = new OutputStreamWriter(new FileOutputStream("b.txt"), "UTF-8");
        try {
            out.write("mytext");
            out2.write("something else");
        } catch (IOException e) {
            logIt(e.getMessage(),e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {

            }
            try {
                out2.close();
            } catch (IOException e) {

            }
        }
    }
    
    public String logAndDestroy() {
        try {
            methodWithAnException();

            return "value";
        } catch (SQLException e) {
            logIt(e.getMessage(),e);
            return null;
        }
    }
}

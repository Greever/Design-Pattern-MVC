/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Presenter.ALoginManagerPresenter;
import java.util.ArrayList;

/**
 *
 * @author olf
 */
public interface ILoginManager {
    public String getUserName();
    public String getUserPassword();
    public void setLoginManagerPresenter(ALoginManagerPresenter _InputPresenter);
    public void notifyUser(boolean logedIn, String notification);
    public void setUserNames(ArrayList<String> userNames);
}

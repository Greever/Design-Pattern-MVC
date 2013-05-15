/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Presenter.AUserLoginPresenter;

/**
 *
 * @author olf
 */
public interface IUserLogin {
    
    
    public String getUserName();
    public String getUserPassword();
    public void setLoginManagerPresenter(AUserLoginPresenter _InputPresenter);
    public void notifyUser(boolean logedIn, String notification);   
}

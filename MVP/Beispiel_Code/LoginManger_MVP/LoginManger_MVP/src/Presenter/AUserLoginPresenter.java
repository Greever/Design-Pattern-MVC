/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.AUserHandler;
import View.IUserLogin;

/**
 *
 * @author olf
 */
public abstract class AUserLoginPresenter {
    
    protected IUserLogin   _UserLoginView;
    protected AUserHandler _UserStorage;
    
    public abstract void login();
    public abstract void setAUserHandler(AUserHandler _InputStorage);
    public abstract void setAUserLoginView(IUserLogin _inputLoginView);
}

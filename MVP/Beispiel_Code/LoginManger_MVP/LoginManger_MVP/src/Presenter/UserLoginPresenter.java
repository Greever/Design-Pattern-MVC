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
public class UserLoginPresenter extends AUserLoginPresenter {
 
    @Override
    public void login() {
     String username = _UserLoginView.getUserName();
     String password = _UserLoginView.getUserPassword();
     boolean logedIn = _UserStorage.validatePassword(username,password);
     _UserLoginView.notifyUser(logedIn, "Login: ");
    
    }

    @Override
    public void setAUserHandler(AUserHandler _InputStorage) {
        this._UserStorage = _InputStorage;
    }

    @Override
    public void setAUserLoginView(IUserLogin _inputLoginView) {
        this._UserLoginView = _inputLoginView;
    } 
}

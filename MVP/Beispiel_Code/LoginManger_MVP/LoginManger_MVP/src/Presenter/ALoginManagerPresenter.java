/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.AUserHandler;
import View.ILoginManager;

/**
 *
 * @author olf
 */
public abstract class ALoginManagerPresenter {
    
    protected ILoginManager _LoginManagerView;
    protected AUserHandler  _UserStorage;
    
    public abstract void modifyPasswordForUser();
    public abstract void removeUser();
    public abstract void saveUser();
    public abstract void setAUserHandler(AUserHandler _InputStorage);
    public abstract void setaLoginManagerView(ILoginManager _inputLoginView);
    
    
}

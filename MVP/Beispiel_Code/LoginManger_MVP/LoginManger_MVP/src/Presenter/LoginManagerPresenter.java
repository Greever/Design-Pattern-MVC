/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.AUserHandler;
import View.ILoginManager;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author olf
 */
public class LoginManagerPresenter extends ALoginManagerPresenter{  
    
    public LoginManagerPresenter() {}
      
    @Override
    public void modifyPasswordForUser(){
        String username = _LoginManagerView.getUserName();
        String changedPassword = _LoginManagerView.getUserPassword();
        boolean passwordChanged = _UserStorage.changePassword(username, changedPassword);
        _LoginManagerView.notifyUser(passwordChanged, "Password Modification: ");
    }
    
    @Override
    public void removeUser() {
        String username = _LoginManagerView.getUserName();   
        boolean userDeleted = _UserStorage.deleteUser(username);
        _LoginManagerView.notifyUser(userDeleted, "Delete User: ");
        if (userDeleted)
            presentCurrentUserList();
    }
    
    @Override
    public void saveUser() {
        String username = _LoginManagerView.getUserName();
        String changedPassword = _LoginManagerView.getUserPassword();
        boolean userAdded = _UserStorage.setUser(username, changedPassword);
        _LoginManagerView.notifyUser(userAdded, "Saved User: ");
        
        if (userAdded) 
            presentCurrentUserList();
    }
    
    private void presentCurrentUserList() { 
        _LoginManagerView.setUserNames(_UserStorage.getAllUserNames());
    }

    @Override
    public void setAUserHandler(AUserHandler _InputStorage) {
        this._UserStorage = _InputStorage;
        this._UserStorage.addObserver(new Observer () {
                                public void update(Observable arg0, Object arg1){
                                presentCurrentUserList();
				}
			});
    }
    
    @Override
    public void setaLoginManagerView(ILoginManager _inputView) {
        this._LoginManagerView = _inputView;
    }
     
}

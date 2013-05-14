
import Model.AUserHandler;
import Model.UserStorage1;
import Presenter.ALoginManagerPresenter;
import Presenter.AUserLoginPresenter;
import Presenter.LoginManagerPresenter;
import Presenter.UserLoginPresenter;
import View.ILoginManager;
import View.IUserLogin;
import View.LoginScreen;
import View.UserManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olf
 */
public class LoginManagerMain {
    public static void main (String args []) {
        //init objects
        AUserHandler _h             = new UserStorage1();
        AUserLoginPresenter _pLogin  = new UserLoginPresenter();
        ALoginManagerPresenter _pManager = new LoginManagerPresenter();
        IUserLogin _vLogin   = new LoginScreen();  
        ILoginManager _vManager = new UserManager(); 
        
        
        //init relationships
        _vLogin.setLoginManagerPresenter(_pLogin);
        _vManager.setLoginManagerPresenter(_pManager);
        
        _pLogin.setAUserLoginView(_vLogin);
        _pLogin.setAUserHandler(_h);
        
        _pManager.setaLoginManagerView(_vManager);
        _pManager.setAUserHandler(_h);

    }
}

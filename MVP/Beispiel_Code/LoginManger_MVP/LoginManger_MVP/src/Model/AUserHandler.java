/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author olf
 */

public abstract class  AUserHandler extends Observable {
    
    public abstract boolean setUser(String inputUserName, String inputPassword);
    public abstract boolean deleteUser(String inputUserName);
    public abstract User getUser(String inputUserName);
    public abstract boolean validatePassword(String inputUserName, String inputPassword);
    public abstract boolean changePassword(String inputUserName, String inputPassword);
    public abstract ArrayList<String> getAllUserNames();
}



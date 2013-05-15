/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

/**
 *
 * @author olf
 */
public class UserStorage1 extends AUserHandler  {
    
    private HashMap<String, User> userStorage;
    
    public UserStorage1 () {
        userStorage = new HashMap<>();
    }
    
    @Override
    public boolean setUser(String inputUserName, String inputPassword) {
        if (this.UserExists(inputUserName)) {
            return false;
        }
        else {
            userStorage.put(inputUserName, new User(inputUserName,inputPassword));
            this.hasChanged();
            this.notifyObservers();
            return true;
        }
       
    }

    @Override
    public boolean deleteUser(String inputUserName) {
        userStorage.remove(inputUserName);
        if (!userStorage.containsKey(inputUserName)) {
            this.hasChanged();
            this.notifyObservers();
            return true;
        }
        else
            return false;
    } 

    @Override
    public User getUser(String inputUserName) {
        return userStorage.get(inputUserName);
    }
    
    

    @Override
    public boolean changePassword(String inputUserName, String inputPassword) {
       User tmpUser = userStorage.get(inputUserName);
       if (userStorage.get(inputUserName) != null) {
           userStorage.get(inputUserName).setPassword(inputPassword);
           return true;
       }
       else
           return false;
    }
    
    private boolean UserExists(String inputUserName) {
        boolean userExist = false;
        
        if (userStorage.containsKey(inputUserName)) {
            userExist = true;
        }
        return userExist;
    }

    @Override
    public boolean validatePassword(String inputUserName, String inputPassword) {
        if (UserExists(inputUserName)) { 
            return userStorage.get(inputUserName).getPassword().equals(inputPassword);
        }
        else
            return false;
            
    }
    
    @Override
    public ArrayList<String> getAllUserNames() {
       return new ArrayList<>(userStorage.keySet());  
    }
    
    
}

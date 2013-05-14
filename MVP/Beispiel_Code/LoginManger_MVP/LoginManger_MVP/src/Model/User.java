/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author olf
 */
public class User {
    String name;
    String password;
    
    public User(String inputName, String inputPassword) {
        this.name = inputName;
        this.setPassword(inputPassword);
    }
    
    public void setPassword(String inputPassword) {
        this.password = inputPassword;
    }
    
    public String getUserName() {
        return this.name;
    }
    
    public String getPassword() {
        return this.password;
    }
}

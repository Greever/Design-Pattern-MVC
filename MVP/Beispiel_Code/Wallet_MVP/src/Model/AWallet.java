/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Observable;

/**
 *
 * @author olf
 */
public abstract class AWallet extends Observable {
    
    public abstract double getWalletValue();
    public abstract void   setWalletValue(double inputMoney); 
    public abstract double getMaxWalletValue();
}

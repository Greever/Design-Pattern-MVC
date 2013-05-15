/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.event.ChangeListener;

/**
 *
 * @author olf
 */
public interface IWalletView {
    /*
     *@brief set Listener for changes in Model
     */
    public void setMoneyListener(ChangeListener _e);
    public int  getMoneyFromView();
    public void setMoneyToView(double inputMoney);
    
    /*
     * @brief set JFrame visible
     */
    public void setVisible(boolean state);  
}

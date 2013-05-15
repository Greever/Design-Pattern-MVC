/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.AWallet;
import View.IWalletView;
import java.util.Observable;
import java.util.Observer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author olf
 */
public class WalletPresenter {
    
    private IWalletView _walletView;
    private AWallet     _walletModel;
   
    /**
     * @brief create WalletPresenter to communicate between View and Model
     * @param set IWalletView to handle
     * @param set AWallet to handle
     */
    public WalletPresenter(IWalletView _inputWalletView,AWallet _inputWalletModel) {    
        this._walletModel = _inputWalletModel;
        this._walletView  = _inputWalletView;
        this._walletView.setVisible(true);
 
        this._walletModel.addObserver(new Observer() {
                @Override
                public void update(Observable arg0, Object arg1) {
                    double value = WalletPresenter.this._walletModel.getWalletValue();
                    WalletPresenter.this._walletView.setMoneyToView(value);
                }
        }); 
        
        this._walletView.setMoneyListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    int value = WalletPresenter.this._walletView.getMoneyFromView();
                    WalletPresenter.this._walletModel.setWalletValue(value);
                }
        });  
        
       
       double tmpValue = this._walletModel.getWalletValue();
       this._walletView.setMoneyToView(tmpValue);
       
       this._walletView.setVisible(true);
    }               
}

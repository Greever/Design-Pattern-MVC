
import Model.AWallet;
import Model.OurWallet;
import Presenter.WalletPresenter;
import View.SliderWalletView;
import View.SpinnerWalletView;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olf
 */
public class WalletMain {
    
    public static void main(String args[]) {
        AWallet _wallet =  new OurWallet();
        new WalletPresenter(new SliderWalletView(),_wallet);
        new WalletPresenter(new SpinnerWalletView(),_wallet);   
    }
}

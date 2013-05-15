/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author olf
 */
public class OurWallet extends AWallet {
   
    
    private double maxMoney;
    private double currentMoney;
    
    /**
     * @brief default constructor
     */       
    public OurWallet () {
        this.currentMoney = 0.0;
        this.maxMoney = 100.0;
    }        
    
    /**
     * @brief construct OurWallet-Object with special wallet values
     *        and test for valid values
     * @param maximum Money to set
     * @param current Money in Wallet 
     */
    public OurWallet(double inputMaxMoney, double inputCurrentMoney) {
        this();
        if (validateMoney(inputMaxMoney))
            this.maxMoney = inputMaxMoney;
        
        if (validateMoney(currentMoney))
            this.currentMoney = inputCurrentMoney;
    }
    
    /**
     * @brief validate current amount of money
     * @param validate inputValue
     * @return true, if value is smaller or equal maxValue
     *         and bigger or equal than zero
     */
    private boolean validateMoney(double inputMoney) {
        if (inputMoney >= 0 && inputMoney <= maxMoney)
            return true;
        else
            return false;
    }

    @Override
    public double getWalletValue() {
       return this.currentMoney;
    }

    /**
     * @brief set current value as money in Wallet if possible
     *        and notify observer
     * @param money to set 
     */
    @Override
    public void setWalletValue(double inputMoney) { 
        if(this.validateMoney(inputMoney)) {
             this.currentMoney = inputMoney;    
             this.setChanged();                 
             this.notifyObservers();
         }         
    }

    /**
     * @return current amount of money in wallet 
     */
    @Override
    public double getMaxWalletValue() {
        return this.maxMoney;
    }
    
}

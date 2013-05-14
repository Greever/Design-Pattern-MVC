/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.Deposit;

/**
 *
 * @author olf
 */
public class DepositPresenter {

    
    public double calculateDeposit() {
		double sum = 0.0; 
		for (Deposit deposit: depositList)
			sum += deposit.getPrice();
		return sum;
	}
}

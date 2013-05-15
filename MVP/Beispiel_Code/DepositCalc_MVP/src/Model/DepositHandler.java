package Model;

import java.util.ArrayList;

public class DepositHandler implements IDepositHandler {

	/**
	 * @ data container for deposit
	 */
	private ArrayList<Deposit> depositList;
	
	/**
	 * @brief calculate current deposit
	 */
	

	/**
	 * @brief get a list of all Deposit
	 */
	public ArrayList<Deposit> getDepositValues() {
		return depositList;
	}

    @Override
    public void setDepositValues(ArrayList<Deposit> values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

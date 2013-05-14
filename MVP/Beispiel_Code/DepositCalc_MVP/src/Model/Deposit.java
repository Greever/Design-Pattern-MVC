package Model;

public class Deposit {

	String depositName;
	double price;
	int id;
	
	/**
	 * @brief construct deposit_object with name and price
	 * @param Name to set
	 * @param Price to set
	 */
	public Deposit(String inputName, double inputPrice) {
		this.depositName = inputName;
		if (this.validateDepositPrice(inputPrice)) 
			this.price = inputPrice; 
		else
			this.price = 0.0;
	}
	
	/**
	 * @brief validate inputPrice
	 * @param price to validate
	 * @return return true if validation was successful
	 */
	private boolean validateDepositPrice(double inputPrice) {
		
		if (inputPrice >= 0)
			return true;
		else
			return false;
	}
	/**
	 * @brief get current deposit price
	 * @return price of deposit
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * @brief get current deposit name
	 * @return name of deposit
	 */
	public String getName() {
		return this.depositName;
	}
	
	/**
	 * @biref set current deposit price
	 * @param Price to set
	 */
	public void setPrice(double inputPrice) {
		if (validateDepositPrice(inputPrice))
			this.price = inputPrice;
		
	}
	
	/**
	 * @brief set current deposit name
	 * @param Name to set
	 */
	public void setName(String inputName) {
		this.depositName = inputName;
	}
}

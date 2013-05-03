package model;


public class Model extends AbstractModel {
	private int value;
	
	public int getValue() {
		int value = 0;
		
		{
			value = this.value;
		}
		
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
		
		{
			this.value = Math.max(this.value, -10);
			this.value = Math.min(this.value, 10);
		}
		
		{
			this.setChanged();
			
			this.notifyObservers();
		}
	}
}
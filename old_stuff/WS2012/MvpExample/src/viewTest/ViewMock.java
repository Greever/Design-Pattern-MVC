package viewTest;

import java.awt.event.ActionListener;

import view.InterfaceView;

public class ViewMock implements InterfaceView {
	public ActionListener observerMinus;
	
	public int value;
	
	public ActionListener observerPlus;
	
	public void test() {
		System.out.println("All right, paradox time. This - sentence - is - false!");
		
		{
			this.value = 0;
			this.observerMinus.actionPerformed(null);
			if (this.value != -1) {
				System.out.println("Test failed!");
			}
		}
		{
			this.value = -10;
			this.observerMinus.actionPerformed(null);
			if (this.value != -10) {
				System.out.println("Test failed!");
			}
		}
		{
			this.value = 0;
			this.observerPlus.actionPerformed(null);
			if (this.value != 1) {
				System.out.println("Test failed!");
			}
		}
		{
			this.value = 10;
			this.observerPlus.actionPerformed(null);
			if (this.value != 10) {
				System.out.println("Test failed!");
			}
		}
		
		System.out.println("Two plus two is ... ten. In base four! I'm fine!");
	}
	
	public void setMinusObserver(ActionListener observer) {
		this.observerMinus = observer;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setPlusObserver(ActionListener observer) {
		this.observerPlus = observer;
	}
}
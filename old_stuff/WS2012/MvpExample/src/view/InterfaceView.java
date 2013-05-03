package view;

import java.awt.event.ActionListener;

public interface InterfaceView {
	public void setMinusObserver(ActionListener observer);
	
	public int getValue();
	
	public void setValue(int value);
	
	public void setPlusObserver(ActionListener observer);
}
package model;

import java.util.Observable;

public abstract class AbstractModel extends Observable {
	public abstract int getValue();
	
	public abstract void setValue(int value);
}
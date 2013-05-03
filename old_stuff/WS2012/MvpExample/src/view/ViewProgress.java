package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ViewProgress implements InterfaceView {
	private JFrame frameHandle;
	
	private JButton buttonPlus;
	private JProgressBar progressHandle;
	private JButton buttonMinus;
	
	public ViewProgress() {
		this.frameHandle = new JFrame();
		this.frameHandle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameHandle.setTitle("Progress");
		this.frameHandle.setBounds(100, 100, 240, 84);
		this.frameHandle.getContentPane().setLayout(null);
		
		this.buttonMinus = new JButton("-");
		this.buttonMinus.setFocusPainted(false);
		this.buttonMinus.setBounds(10, 11, 42, 23);
		this.frameHandle.getContentPane().add(this.buttonMinus);
		
		this.progressHandle = new JProgressBar();
		this.progressHandle.setBounds(62, 11, 100, 23);
		this.progressHandle.setMinimum(-10);
		this.progressHandle.setMaximum(10);
		this.frameHandle.getContentPane().add(this.progressHandle);
		
		this.buttonPlus = new JButton("+");
		this.buttonPlus.setFocusPainted(false);
		this.buttonPlus.setBounds(172, 11, 42, 23);
		this.frameHandle.getContentPane().add(this.buttonPlus);
		
		this.frameHandle.setVisible(true);
	}
	
	public void setMinusObserver(ActionListener observer) {
		this.buttonMinus.addActionListener(observer);
	}
	
	public int getValue() {
		int value = 0;
		
		{
			value = this.progressHandle.getValue();
		}
		
		return value;
	}
	
	public void setValue(int value) {
		this.progressHandle.setValue(value);
	}
	
	public void setPlusObserver(ActionListener observer) {
		this.buttonPlus.addActionListener(observer);
	}
}
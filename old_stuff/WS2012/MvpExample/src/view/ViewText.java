package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ViewText implements InterfaceView {
	private JFrame frameHandle;
	
	private JButton buttonPlus;
	private JTextField textHandle;
	private JButton buttonMinus;
	
	public ViewText() {
		this.frameHandle = new JFrame();
		this.frameHandle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameHandle.setTitle("Text");
		this.frameHandle.setBounds(340, 100, 240, 84);
		this.frameHandle.getContentPane().setLayout(null);
		
		this.buttonMinus = new JButton("-");
		this.buttonMinus.setFocusPainted(false);
		this.buttonMinus.setBounds(10, 11, 42, 23);
		this.frameHandle.getContentPane().add(this.buttonMinus);
		
		this.textHandle = new JTextField();
		this.textHandle.setBounds(62, 12, 100, 21);
		this.textHandle.setEditable(false);
		this.frameHandle.getContentPane().add(this.textHandle);
		
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
		
		try {
			value = Integer.parseInt(this.textHandle.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
	public void setValue(int value) {
		this.textHandle.setText(String.valueOf(value));
	}
	
	public void setPlusObserver(ActionListener observer) {
		this.buttonPlus.addActionListener(observer);
	}
}
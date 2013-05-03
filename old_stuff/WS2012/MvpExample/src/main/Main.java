package main;

import java.awt.EventQueue;

import javax.swing.UIManager;

import model.Model;
import presenter.Presenter;
import view.ViewProgress;
import view.ViewText;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					{
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
					}
					
					{
						Model model = new Model();
						
						new Presenter(model, new ViewProgress());
						new Presenter(model, new ViewText());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
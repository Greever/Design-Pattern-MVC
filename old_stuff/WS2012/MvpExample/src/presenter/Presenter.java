package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import model.AbstractModel;
import view.InterfaceView;

public class Presenter {
	public AbstractModel model;
	
	public InterfaceView view;
	
	public Presenter(AbstractModel model, InterfaceView view) {
		{
			this.model = model;
			
			this.model.addObserver(new Observer() {
				public void update(Observable arg0, Object arg1) {
					int value = Presenter.this.model.getValue();
					
					Presenter.this.view.setValue(value);
				}
			});
		}
		
		{
			this.view = view;
			
			this.view.setMinusObserver(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int value = Presenter.this.view.getValue();
					
					value -= 1;
					
					Presenter.this.model.setValue(value);
				}
			});
			
			this.view.setPlusObserver(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int value = Presenter.this.view.getValue();
					
					value += 1;
					
					Presenter.this.model.setValue(value);
				}
			});
			
			{
				int value = this.model.getValue();
				
				this.view.setValue(value);
			}
		}
	}
}
package mainTest;

import model.Model;
import presenter.Presenter;
import viewTest.ViewMock;

public class Main {
	public static void main(String[] args) {
		Model model = new Model();
		
		{
			ViewMock test = new ViewMock();
			
			new Presenter(model, test);
			
			test.test();
		}
	}
}
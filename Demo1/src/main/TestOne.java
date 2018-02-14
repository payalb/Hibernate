package main;

import javax.swing.SwingUtilities;

import com.java.controller.Controller;
import com.java.model.Model;
import com.java.view.View;

public class TestOne {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				Model model= new Model();
				View view= new View();
				Controller controller= new Controller(model, view);
				view.setLoginListener(controller);
				
			}
			
		});
			
	}

}

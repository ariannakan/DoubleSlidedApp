package sp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import sp.controller.ExitApplicationController;
import sp.model.Model;
import sp.view.DoubleSlidedApp;

public class Launcher {
	public static void main(String[] args) {
		Model m = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(m);
		
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new ExitApplicationController(app).process();
			}
		});
		
		app.setVisible(true);
	}
}

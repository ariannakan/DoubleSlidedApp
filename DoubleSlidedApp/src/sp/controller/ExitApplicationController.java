package sp.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Controller to confirm request to exit application
 */

public class ExitApplicationController {
	
	JFrame app;
	
	public ExitApplicationController(JFrame app) {
		this.app = app;
	}
	
	public void process() {
		int c = JOptionPane.showConfirmDialog(app, "Do you wish to exit application?");
		
		if (c == JOptionPane.OK_OPTION) {
			app.setVisible(false);
			app.dispose();
		}
	}

}

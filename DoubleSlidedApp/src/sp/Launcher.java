package sp;

import sp.model.Model;
import sp.view.DoubleSlidedApp;

public class Launcher {
	public static void main(String[] args) {
		Model m = new Model();
		DoubleSlidedApp dsa = new DoubleSlidedApp(m);
		
		dsa.setVisible(true);
	}
}

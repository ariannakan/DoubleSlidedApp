package sp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import sp.model.Model;
import sp.view.DoubleSlidedApp;

/**
 * Controller to reset puzzle panel
 */

public class ResetController implements ActionListener {

	DoubleSlidedApp app;
	Model model;
	FlipController fc;
	
	public ResetController(DoubleSlidedApp app, Model m, FlipController fc) {
		this.app = app;
		this.model = m;
		this.fc = fc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.reset();
		fc.numMoves = 0;
		app.numberMovesLabel.setText("" + fc.numMoves);
		app.repaint();
		
	}
}

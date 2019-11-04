package sp.controller;

import java.awt.event.MouseAdapter;

import sp.model.Model;
import sp.view.DoubleSlidedApp;

public class SolutionController extends MouseAdapter {
	Model model;
	DoubleSlidedApp app;
	
	SolutionController(Model m, DoubleSlidedApp app){
		this.model = m;
		this.app = app;
	}
	
	
	
}

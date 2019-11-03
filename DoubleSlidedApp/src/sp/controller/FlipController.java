package sp.controller;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;
import sp.view.PuzzleView;

public class FlipController extends MouseAdapter{
	Model model;
	DoubleSlidedApp app;
	
	public FlipController(DoubleSlidedApp app, Model m) {
		this.app = app;
		this.model = m;
	}
	
	public void mousePressed(MouseEvent me) {
		System.out.println(me.getPoint());
		Tile tile = model.getTile();
		Point p = me.getPoint();
		Rectangle r = new Rectangle(tile.getLocation().col*100, tile.getLocation().row*100, 100, 100);
		if(r.contains(p)) {
			//if so flip and move
			tile.flip();
			System.out.println(tile.visibleDigit());
			tile.setLocation(new Location(1,2));
			//refresh display
			app.repaint();
		}
	}
}
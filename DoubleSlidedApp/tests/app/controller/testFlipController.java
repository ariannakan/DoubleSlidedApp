package app.controller;

import static org.junit.Assert.*;

import java.awt.event.MouseEvent;

import org.junit.Test;

import sp.controller.FlipController;
import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;

public class testFlipController {

	Model m = new Model();
	DoubleSlidedApp app = new DoubleSlidedApp(m);
	FlipController fc = new FlipController(app, m);
	
	Tile t1 = new Tile(1);
	
	@Test
	public void testValidMove(){
		//emptyTile is at (0,2)
		t1.setLocation(new Location(0,1));
		
		assertTrue(fc.isValidMove(t1));
		
		t1.setLocation(new Location(3,0));
		
		assertFalse(fc.isValidMove(t1));
		
	}
	
	@Test
	public void testSlide(){
		//emptyTile is at (0,2)
		Tile t2 = new Tile(2,2,false);
		t2.setLocation(new Location(1,2));
		Location emptyLoc = m.emptyTile.getLocation();
		
		fc.slideTile(t2);
		assertTrue(t2.getLocation() == emptyLoc);
		
	}
	
	@Test
	public void testFCMousePressed(){
		//valid mouse click
		MouseEvent e = new MouseEvent(app, 0, 0, 0, 150, 80, 0, false);
		fc.mousePressed(e);
		
		//invalid mouse click = tile is not adjacent
		MouseEvent f = new MouseEvent(app, 0,0,0,150,150,0,false);
		fc.mousePressed(f);
	}
}

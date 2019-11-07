package app.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import sp.controller.SolutionController;
import sp.model.Model;
import sp.model.Solution;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;

public class testSolutionController {

	Solution solution = new Solution();
	Model model = new Model();
	DoubleSlidedApp app = new DoubleSlidedApp(model);
	SolutionController sc = new SolutionController(model, app);
	
	@Test
	public void testLoseCase(){
		
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			tile.flip();
		}
		assertFalse(sc.checkLoseCase());
		
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			if(tile.visibleDigit() == 4){
				tile.flip();
			}
		}
		assertTrue(sc.checkLoseCase());
		
	}
	
//	@Test
//	public void testWinCondition(){
//		for(Iterator<Tile> it = solution.tiles(); it.hasNext();) {
//			Tile sol = it.next();
//			Tile m = model.getTile(sol.getLocation());
//			m.setUp(sol.visibleDigit());
//		}
//		assertTrue(sc.checkWinCase());
//	}
}

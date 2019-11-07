package app.model;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import sp.model.Location;
import sp.model.Model;
import sp.model.Solution;
import sp.model.Tile;

public class modelTest {
	
	Model model = new Model();
	
	@Test
	public void testEmpty(){
		Tile empty = new Tile(1);
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			
			if(model.isEmptyTile(tile)){
				empty = tile;
			}
		}
		
		assertEquals(empty, model.emptyTile);
		assertTrue(empty.getLocation() == model.emptyTile.getLocation());
		
	}
	
	@Test
	public void testSolution(){
		Solution solution = new Solution();
		for(Iterator<Tile> it = solution.tiles(); it.hasNext();) {
			Tile sol = it.next();
			Location loc = sol.getLocation();
			if(model.getTileFromLoc(loc) == sol.visibleDigit()){
				assertEquals(model.getTileFromLoc(loc), sol.visibleDigit());
			}
		}
		//test for non-existing tile (unknown location)
		assertEquals(0, solution.getTileFromLoc(new Location(4,0)));

	}
	
	@Test
	public void testModel(){
		Solution solution = new Solution();
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			Location loc = tile.getLocation();
			if(solution.getTileFromLoc(loc) == tile.visibleDigit()){ 
				assertEquals(solution.getTileFromLoc(loc), tile.visibleDigit());
			}
		}
		//test for non-existing tile (unknown location)
		assertEquals(0, model.getTileFromLoc(new Location(4,0)));

	}
}

package app.model;

import static org.junit.Assert.*;

import org.junit.Test;

import sp.model.Location;
import sp.model.Tile;

public class tileTest {
	
	Location loc = new Location(1,0);
	
	Tile t1 = new Tile(1,1,false);
	
	Tile t2 = new Tile(2,0,true);
	
	Tile t3 = new Tile(4);
	
	Tile t4 = new Tile(1);
	
	@Test
	public void testLoc(){
		t1.setLocation(new Location(1,0));
		t2.setLocation(new Location(2,3));
		t3.setLocation(loc);
		
		assertEquals(t1.getLocation().col, loc.col);
		assertEquals(t1.getLocation().row, loc.row);
		
		assertEquals(t3.getLocation().col, t1.getLocation().col);
		assertEquals(t3.getLocation().row, t1.getLocation().row);

		
	}
	
	@Test
	public void testFlip(){
		
		assertEquals(t4.visibleDigit(), t1.visibleDigit());
		
		t4.flip();
		
		assertEquals(t2.getState(), t4.getState());
		
		assertTrue(t4.getState());
		assertFalse(t3.getState()); 
		
		assertEquals(1, t1.visibleDigit());	
		
		assertEquals(t2.visibleDigit(), t4.visibleDigit());
		
	}

}

package sp.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {

	final Tile tile1 = new Tile(1);
	final Tile tile2 = new Tile(2);
	final Tile tile3 = new Tile(3);
	final Tile tile4 = new Tile(4);
	final Tile emptyTile = new Tile(0);	//empty tile
	final Tile tile6 = new Tile(4);
	final Tile tile7 = new Tile(3);
	final Tile tile8 = new Tile(2);
	final Tile tile9 = new Tile(1);
	
	ArrayList<Tile> solution = new ArrayList<>();
	
	
	public Solution() {
		
		solution.add(tile1);
		solution.add(tile2);
		solution.add(tile3);
		solution.add(tile4);
		solution.add(emptyTile);
		solution.add(tile6);
		solution.add(tile7);
		solution.add(tile8);
		solution.add(tile9);
		
		tile1.setLocation(new Location(0,0));
		tile2.setLocation(new Location(0,1));
		tile3.setLocation(new Location(0,2));
		tile4.setLocation(new Location(1,0));
		emptyTile.setLocation(new Location(1,1));
		tile6.setLocation(new Location(1,2));
		tile7.setLocation(new Location(2,0));
		tile8.setLocation(new Location(2,1));
		tile9.setLocation(new Location(2,2));
		
	}
	
	/** Return the tiles dynamically **/
	public Iterator<Tile> tiles(){
		return solution.iterator();
	}
}

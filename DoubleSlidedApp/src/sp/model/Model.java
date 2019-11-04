package sp.model;

import java.util.*;

public class Model {

	final Tile tile1 = new Tile(1, 4, false);
	final Tile tile2 = new Tile(3, 2, true);
	final Tile tile3 = new Tile(2, 3, false);	//empty tile
	final Tile tile4 = new Tile(3, 2, true);
	final Tile tile5 = new Tile(2, 3, true);
	final Tile tile6 = new Tile(4, 1, false);
	final Tile tile7 = new Tile(1, 4, false);
	final Tile tile8 = new Tile(2, 3, false);
	final Tile tile9 = new Tile(4, 1, true);

	
	ArrayList<Tile> puzzle = new ArrayList<>();
	
	public Model() {
		tile1.setLocation(new Location(0,0));
		puzzle.add(tile1);

		tile2.setLocation(new Location(0,1));
		puzzle.add(tile2);
		
		tile3.setLocation(new Location(0,2));
		puzzle.add(tile3);
		
		tile4.setLocation(new Location(1,0));
		puzzle.add(tile4);
		
		tile5.setLocation(new Location(1,1));
		puzzle.add(tile5);
		
		tile6.setLocation(new Location(1,2));
		puzzle.add(tile6);
		
		tile7.setLocation(new Location(2,0));
		puzzle.add(tile7);
		
		tile8.setLocation(new Location(2,1));
		puzzle.add(tile8);
		
		tile9.setLocation(new Location(2,2));
		puzzle.add(tile9);
		
	}
	
	
	/** Get tile at location **/
	public Tile getTile(int location) { 
		
		return puzzle.get(location); 
	}
	
	/** Return the tiles dynamically **/
	public Iterator<Tile> tiles(){
		return puzzle.iterator();
	}
	
}

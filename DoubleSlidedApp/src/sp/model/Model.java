package sp.model;

import java.util.*;

public class Model {

	final Tile tile1 = new Tile(1, 4, false);
	final Tile tile2 = new Tile(3, 2, true);
	final public Tile emptyTile = new Tile(0, 0, false);	//empty tile
	final Tile tile4 = new Tile(3, 2, true);
	final Tile tile5 = new Tile(2, 3, true);
	final Tile tile6 = new Tile(4, 1, false);
	final Tile tile7 = new Tile(1, 4, false);
	final Tile tile8 = new Tile(2, 3, false);
	final Tile tile9 = new Tile(4, 1, true);

	
	ArrayList<Tile> puzzle = new ArrayList<>();
	
	
	public Model() {
		reset();
		puzzle.add(tile1);
		puzzle.add(tile2);
		puzzle.add(emptyTile);
		puzzle.add(tile4);
		puzzle.add(tile5);
		puzzle.add(tile6);
		puzzle.add(tile7);
		puzzle.add(tile8);
		puzzle.add(tile9);
	}
	
	public void reset() {
		tile1.setLocation(new Location(0,0));
		tile2.setLocation(new Location(0,1));
		emptyTile.setLocation(new Location(0,2));
		tile4.setLocation(new Location(1,0));
		tile5.setLocation(new Location(1,1));
		tile6.setLocation(new Location(1,2));
		tile7.setLocation(new Location(2,0));
		tile8.setLocation(new Location(2,1));
		tile9.setLocation(new Location(2,2));
		
		tile1.flipped = false;
		tile2.flipped = true;
		tile4.flipped = true;
		tile5.flipped = true;
		tile6.flipped = false;
		tile7.flipped = false;
		tile8.flipped = false;
		tile9.flipped = true;
	}
	
	
//	/** Get tile at location **/
//	public Tile getTile(int location) { 
//		
//		return puzzle.get(location); 
//	}
	
	public boolean isEmptyTile(Tile t){
		if(t.equals(emptyTile)){
			return true;
		}
		else{
			return false;
		}
	}
	
	/** Return tile's visible number at corresponding location **/
	public int getTileFromLoc(Location loc){
		for(Iterator<Tile> it = this.tiles(); it.hasNext();) {
			Tile tile = it.next();
			if((tile.location.row == loc.row) && (tile.location.col == loc.col)){
				return tile.visibleDigit();
			}
		}
		return 0;
	}
	
	/** Return the tiles dynamically **/
	public Iterator<Tile> tiles(){
		return puzzle.iterator();
	}
	
//	/** ONLY FOR TESTING **/
//	public Tile getTile(Location loc){
//		for(Iterator<Tile> it = this.tiles(); it.hasNext();) {
//			Tile tile = it.next();
//			if(tile.getLocation() == loc){
//				return tile;
//			}
//		}
//		return null;
//	}
	
	
}

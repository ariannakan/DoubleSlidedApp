package sp.model;

public class Model {

	Tile tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9;
	
	public Model() {
		tile1 = new Tile(1, 4, false);
		tile1.setLocation(new Location(0,0));

		tile2 = new Tile(3, 2, true);
		tile2.setLocation(new Location(0,1));
		
		tile3 = new Tile(2, 3, false);	//empty tile
		tile3.setLocation(new Location(0,2));
		
		tile4 = new Tile(3, 2, true);
		tile4.setLocation(new Location(1,0));
		
		tile5 = new Tile(2, 3, true);
		tile5.setLocation(new Location(1,1));
		
		tile6 = new Tile(4, 1, false);
		tile6.setLocation(new Location(1,2));
		
		tile7 = new Tile(1, 4, false);
		tile7.setLocation(new Location(2,0));
		
		tile8 = new Tile(2, 3, false);
		tile8.setLocation(new Location(2,1));
		
		tile9 = new Tile(4, 1, true);
		tile9.setLocation(new Location(2,2));
		
	}
	
	public void addTile() {
		
	}
	
	public Tile getTile() { 
		
		return tile1; 
	}
}

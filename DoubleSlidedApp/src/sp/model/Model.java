package sp.model;

public class Model {

	Tile tile;
	
	public Model() {
		tile = new Tile(2, 3, false);
		tile.setLocation(new Location(1,1));
		
	}
	
	public void setTile(Tile t) {
		this.tile = t;
	}
	
	public Tile getTile() { return tile; }
}

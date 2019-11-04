package sp.model;

public class Tile {
	
	final int up;
	final int down;
	boolean flipped;
	Location location;

	public Tile(int up){
		this.up = up;
		this.down = 0;
		this.flipped = false;	//not flipped
	}
	
	public Tile(int up, int down, boolean flipped) {
		this.up = up;
		this.down = down;
		this.flipped = flipped;
	}
	
	
	public void flip() {
		flipped = !flipped;
	}
	
	public void setLocation(Location loc) {
		location = loc;
	}
	
	public Location getLocation() { return location; }
	
	public int visibleDigit() {
		if(!flipped) { return up; } else { return down; }
	}
	
	public boolean getState() {
		return flipped;
	}
	

}

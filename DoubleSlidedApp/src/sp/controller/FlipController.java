package sp.controller;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;
import sp.view.PuzzleView;

public class FlipController extends MouseAdapter{
	Model model;
	DoubleSlidedApp app;
	
	public int numMoves = 0;
	
	public FlipController(DoubleSlidedApp app, Model m) {
		this.app = app;
		this.model = m;
	}
	
	public void mousePressed(MouseEvent me) {
		//System.out.println(me.getPoint());
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			Point p = me.getPoint();
			Rectangle r = new Rectangle(tile.getLocation().col*100, tile.getLocation().row*100, 100, 100);
			if(r.contains(p)) {
				//is tile valid?
				if(!isValidMove(tile)){	//if not, do nothing
					return;
				}
				//if so flip, move and increment numMoves
				tile.flip();
				slideTile(tile);
				numMoves++;
				app.numberMovesLabel.setText("" + numMoves);
				
				if(checkWinCase()){
					System.out.println("WIN");
				}
				//checkLoseCase();
				//refresh display
				app.repaint();
			}
		}
	}
	
	public boolean checkWinCase(){
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			for(Iterator<Tile> s = model.tiles(); s.hasNext();) {
				Tile sol = s.next();
				if(tile.visibleDigit() != sol.visibleDigit()){
					System.out.printf("wrong: ", tile.visibleDigit());
					return false;
				}
			}
			
		}
		return true;
	}
	
	public boolean checkLoseCase(){
		return false;
	}
	
	
	public boolean isValidMove(Tile t){
		int emptyx = model.emptyTile.getLocation().row;
		int emptyy = model.emptyTile.getLocation().col;
		int tilex = t.getLocation().row;
		int tiley = t.getLocation().col;
		int distance = Math.abs(tilex - emptyx) + Math.abs(tiley - emptyy);
		if(distance == 1.0){
			return true;
		}
		return false;
	}
	
	public void slideTile(Tile t){
		Location emptyLoc = model.emptyTile.getLocation();
		model.emptyTile.setLocation(t.getLocation());
		t.setLocation(emptyLoc);
	}
}

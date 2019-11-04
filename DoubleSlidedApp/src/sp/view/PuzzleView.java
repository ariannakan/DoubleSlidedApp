package sp.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;

public class PuzzleView extends JPanel {
	Model model = new Model();
	
	public PuzzleView(Model model) {
		this.model = model;
	}

	/**
	 * Create the panel.
	 */
	@Override
	public void paintComponent(Graphics g) {
				
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
		
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile t = it.next();
			int dig = t.visibleDigit();
			//System.out.println(t.visibleDigit());
			Location loc = t.getLocation();

		
			//sets configuration tiles
			if(!t.getState()) {
				g.setColor(Color.lightGray);
				g.fillRect(loc.col*100, loc.row*100, 100, 100);
				g.setColor(Color.black);
				g.drawString("" + dig, loc.col * 100 + 36, loc.row * 100 + 66);	//(36,66) center of corner tile
			}
			else {
				g.setColor(Color.BLACK);
				g.fillRect(loc.col*100, loc.row*100, 100, 100);
				g.setColor(Color.white);
				g.drawString("" + dig, loc.col * 100 + 36, loc.row * 100 + 66);	//(36,66) center of corner tile
			}
		}
		
		//sets tile borders
		g.setColor(Color.white);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				g.drawRect(i*100, j*100, 100, 100);
			}
		}
		
		
	}
	

}

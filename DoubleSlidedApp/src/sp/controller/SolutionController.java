package sp.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

import sp.model.Location;
import sp.model.Model;
import sp.model.Solution;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;

public class SolutionController{
	Model model;
	DoubleSlidedApp app;
	Solution solution;
	
	
	SolutionController(Model m, DoubleSlidedApp app){
		this.model = m;
		this.app = app;
		solution = new Solution();
	}
	
	public boolean checkWinCase(){
		for(Iterator<Tile> it = solution.tiles(); it.hasNext();) {
			Tile sol = it.next();
			Location loc = sol.getLocation();
			//System.out.printf("Sol %d, tile %d", sol.visibleDigit(), model.getTileFromLoc(loc));
			if(model.getTileFromLoc(loc) != sol.visibleDigit()){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkLoseCase(){
		HashMap<Integer,Integer> mapOfDigits = new HashMap<Integer,Integer>(){
			{
			put(0,0);
			put(1,0);
			put(2,0);
			put(3,0);
			put(4,0);
			}
		};
		for(Iterator<Tile> it = model.tiles(); it.hasNext();) {
			Tile tile = it.next();
			System.out.println(tile.visibleDigit());
			int val = mapOfDigits.get(tile.visibleDigit());
			mapOfDigits.replace(tile.visibleDigit(), (val + 1));
			//System.out.printf("key %d val %d\n",sol.visibleDigit(),mapOfDigits.get(sol.visibleDigit()));
		}
		return mapOfDigits.containsValue(4);
	}
	
	
}

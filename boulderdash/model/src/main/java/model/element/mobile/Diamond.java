package model.element.mobile;

import java.io.IOException;

import model.element.Permeability;

public class Diamond extends MobileElement{
	
	public Diamond(int x, int y) throws IOException{
		super(x, y, SPRITE, Permeability.PENETRABLE);
	}

	private static String SPRITE = "DIAMOND.PNG";
	
	protected boolean destructible(){
		return true;
	}
	
	public void collectable(){
	}
	
}
package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Earth extends MobileElement{
	

	Earth(int x, int y, String sprite, Permeability permeability) {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	private String SPRITE = "DIRT.PNG";
	
	protected boolean destructible(){
		return false;
	}
}
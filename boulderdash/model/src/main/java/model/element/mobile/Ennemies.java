package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Ennemies extends MobileElement{
	
	public Ennemies() {
		super(x, y, SPRITE, Permeability.BLOCKING);
	}

	private static String SPRITE = "ENNEMIES.PNG";
	
	protected boolean destructible(){
		return true;
	}
}

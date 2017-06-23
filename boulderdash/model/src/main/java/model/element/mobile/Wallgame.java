package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Wallgame extends MobileElement{
	
	/*Constructor*/
	Wallgame() {
		super(x, y, sprite, Permeability.BLOCKING);
	}

	protected static String SPRITE = "WALLGAME.PNG";

	/*Destructible false*/
	protected boolean destructible(){
		return false;
	}
}
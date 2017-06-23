package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Earth extends MobileElement{
	
/**
 * constructor
 * @param x
 * @param y
 * @param sprite
 * @param permeability
 */
	Earth(int x, int y, String sprite, Permeability permeability) {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

/**
 * define the Dirt SPRITE
 */
	private String SPRITE = "DIRT.PNG";

/**
 * Destructible false
 */
	protected boolean destructible(){
		return false;
	}
}
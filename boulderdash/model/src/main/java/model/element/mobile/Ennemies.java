package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Ennemies extends MobileElement{

/**
 * constructor
 */
	public Ennemies() {
		super(x, y, SPRITE, Permeability.BLOCKING);
	}

/**
 * define the sprite Ennemies
 */
	private static String SPRITE = "ENNEMIES.PNG";

/**
 * destructible true
 */
	protected boolean destructible(){
		return true;
	}
}

package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Diamond extends MobileElement{
	
/**
 * constructor
 */
	public Diamond(){
		super(x, y, SPRITE, Permeability.PENETRABLE);
	}

/**
 * define the sprite
 */
	private static String SPRITE = "DIAMOND.PNG";
	
/**
 * Destructible true
 */
	protected boolean destructible(){
		return true;
	}
	
	public void collectable(){
	}
}
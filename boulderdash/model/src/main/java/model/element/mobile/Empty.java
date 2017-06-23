package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Empty extends MobileElement{

/**
 * constructor
 */
	Empty() {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

/**
 * define the sprite Empty
 */
	private static String SPRITE = "EMPTY.PNG";

/**
 * destructible false
 */
	protected boolean destructible(){
		return false;
	}
}

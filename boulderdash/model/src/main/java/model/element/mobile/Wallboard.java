package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Wallboard extends MobileElement{

/**
 * contructor
 */
	Wallboard() {
		super(x, y, sprite, Permeability.BLOCKING);
	}

/**
 * define the sprite WallBoard
 */
	private String SPRITE = "WALLBOARD.PNG";
	
/**
 * destructible false
 */
	protected boolean destructible(){
		return false;
	}
}
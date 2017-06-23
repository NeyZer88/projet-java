package model.element.mobile;

import java.io.IOException;

import model.element.MobileElement;
import model.element.Permeability;

public class Rock extends MobileElement {

/**
 * constructor
 */
	public Rock() {
		super(x, y, SPRITE, Permeability.BLOCKING);
	}

/**
 * define the sprite Rock
 */
	private static final String SPRITE = "ROCK.PNG";

/**
 * method fall
 */
	public void fall(){
	}

/**
 * destructible false
 */
	protected boolean destructible(){
		return false;
	}
}
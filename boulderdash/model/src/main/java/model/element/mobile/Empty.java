package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Empty extends MobileElement{
	
	Empty() {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	private static String SPRITE = "EMPTY.PNG";

	
	protected boolean destructible(){
		return false;
	}
}

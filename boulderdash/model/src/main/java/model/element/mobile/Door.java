package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Door extends MobileElement{
	
	Door() {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	private String SPRITE = "DOOR.PNG";
	
	public boolean destructible(){
		return false;
	}
}
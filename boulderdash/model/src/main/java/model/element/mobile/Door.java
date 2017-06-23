package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Door extends MobileElement{
	
	/*contstructor*/
	Door() {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	/*define the Door SPRITE*/
	private String SPRITE = "DOOR.PNG";
	
	/*Destructible false*/
	public boolean destructible(){
		return false;
	}
}
package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Door extends MotionLessElement{
	
	Door() {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	private String SPRITE = "DOOR.PNG";
	
	public boolean destructible(){
		return false;
	}
}
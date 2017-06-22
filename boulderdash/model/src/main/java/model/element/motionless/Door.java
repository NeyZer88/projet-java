package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Door extends MotionLessElement{
	
	private String SPRITE = "DOOR.PNG";
	
	public boolean destructible(){
		return false;
	}
}
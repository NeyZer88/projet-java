package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Earth extends MotionLessElement{
	

	Earth(int x, int y, String sprite, Permeability permeability) {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	private String SPRITE = "DIRT.PNG";
	
	protected boolean destructible(){
		return false;
	}
}
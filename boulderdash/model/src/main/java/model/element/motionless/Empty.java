package model.element.motionless;
 
import model.element.Permeability;
import model.element.Sprite;

public class Empty extends MotionLessElement{
	
	Empty() {
		super(x, y, sprite, Permeability.PENETRABLE);
	}

	private static String SPRITE = "EMPTY.PNG";

	
	protected boolean destructible(){
		return false;
	}
}

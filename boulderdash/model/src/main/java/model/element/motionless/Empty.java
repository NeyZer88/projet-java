package model.element.motionless;
 
import model.element.Permeability;
import model.element.Sprite;

public class Empty extends MotionLessElement{
	private static String SPRITE = "EMPTY.PNG";

	protected boolean destructible(){
		return false;
	}
}

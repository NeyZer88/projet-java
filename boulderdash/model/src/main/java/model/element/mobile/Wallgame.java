package model.element.motionless;
 
public class Wallgame extends MotionLessElement{
	protected static String SPRITE = "WALLGAME.PNG";
	
	protected boolean destructible(){
		return false;
	}
}

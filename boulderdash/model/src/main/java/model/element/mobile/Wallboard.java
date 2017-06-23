package model.element.motionless;
 
public class Wallboard extends MotionLessElement {
	private String SPRITE = "WALLBOARD.PNG";
	
	protected boolean destructible(){
		return false;
	}
}
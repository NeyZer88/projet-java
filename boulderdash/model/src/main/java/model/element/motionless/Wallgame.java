package model.element.motionless;
 
public class Wallgame extends Moved{
	protected static String SPRITE = "WALLGAME.PNG";
	
	protected boolean destructible(){
		return false;
	}
}

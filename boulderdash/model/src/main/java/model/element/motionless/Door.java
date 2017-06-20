package model.element.motionless;

public class Door extends Mineral{
	
	private String SPRITE = "DOOR.PNG";
	protected boolean destructible(){
		return false;
	}
}
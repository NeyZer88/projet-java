package model.element.motionless;

import model.element.Permeability;

public abstract class MotionlessElementFactory {
	
	
	
	private static final Wallgame wallgame = new Wallgame();
		
	
	
	private static final Wallboard wallboard = new Wallboard();
	
	private static final Empty empty = new Empty();
	
	private static final Door door = new Door();
	
	private static MotionLessElement[] MotionLessElement = {wallgame, wallboard, empty, door, };
	
	
	
	public static MotionLessElement createWallboard(){
		return wallboard;
	}
	
	public static MotionLessElement createWallgame(){
		return wallgame;
	}
	
	public static MotionLessElement createEmpty(){
		return empty;
	}
	
	public static MotionLessElement createDoor(){
		return door;
	}
	
	public static MotionLessElement getFromFileSprite(String fileSprite){
		for (final MotionLessElement motionlessElement: MotionLessElement){
			if (motionlessElement.getSprite() == (fileSprite+".PNG")){
				return motionlessElement;
			}
		}
		
		return empty; 
	}
}
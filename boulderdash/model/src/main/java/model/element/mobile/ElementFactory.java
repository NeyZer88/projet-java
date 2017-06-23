package model.element.mobile;

import model.element.MobileElement;

public abstract class ElementFactory {

	private static final Ennemies ennemies = new Ennemies();
	
	private static final Rock rock = new Rock();
	
	private static final Character character = new Character();
	
	private static final Diamond diamond = new Diamond();
	
	private static final Wallgame wallgame = new Wallgame();
	
	private static final Wallboard wallboard = new Wallboard();
	
	private static final Empty empty = new Empty();
	
	private static final Door door = new Door();

	private static MobileElement[] MobileElements = {diamond, character, rock, ennemies, wallgame, wallboard, empty, door};
	
	public static MobileElement createEnnemies(){
		return ennemies;
	}
	
	public static MobileElement createRock(){
		return rock;
	}
	
	public static MobileElement createCharacter(){
		return character;
	}
	
	public static MobileElement createDiamond(){
		return diamond;
	}
	
	public static MobileElement createWallboard(){
		return wallboard;
	}
	
	public static MobileElement createWallgame(){
		return wallgame;
	}
	
	public static MobileElement createEmpty(){
		return empty;
	}
	
	public static MobileElement createDoor(){
		return door;
	}
	
	public static MobileElement getFromFileSprite(String fileSprite){
		for (final MobileElement mobileElement: MobileElements){
			if (mobileElement.getSprite() == (fileSprite+".PNG")){
				return mobileElement;
			}
		}
		return empty; 
	}
}

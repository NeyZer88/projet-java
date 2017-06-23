package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Character extends MobileElement{
	
	protected static String SPRITE = "HERO.PNG";
	private int mouvement;
	private static int x;
	private static int y;

/**
 * Constructor
 */
	public Character(){
		super(x, y, SPRITE, Permeability.BLOCKING);
	}

/**
 * getter and setter of X
 * @return
 */
	public int getX() {
		return x; 
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
/**
 * getter and setter of Y
 * @return
 */
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

/**
 * getter and setter of Mouvement
 * @return
 */
	public int getMouvement() {
		return mouvement;
	}

	public void setMouvement(int mouvement) {
		this.mouvement = mouvement;
	}

/**
 * getter of SPRITE
 * @return
 */
	public static String getSPRITE() {
		return SPRITE;
	}
	
/**
 * destructible true
 */
	protected boolean destructible(){
		return true;
	}	
}

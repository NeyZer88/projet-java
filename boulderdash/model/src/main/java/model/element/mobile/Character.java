package model.element.mobile;
import java.io.IOException;
import model.element.Sprite;
import model.element.Permeability;

public class Character extends MobileElement{
	
	protected static String SPRITE = "HERO.PNG";
	private int mouvement;
	private int x;
	private int y;

	public Character(final int x, final int y) throws IOException {
		super(x, y, SPRITE, Permeability.BLOCKING);
	}
	 
	public int getX() {
		return x; 
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getMouvement() {
		return mouvement;
	}

	public void setMouvement(int mouvement) {
		this.mouvement = mouvement;
	}

	public static String getSPRITE() {
		return SPRITE;
	}
	
	protected boolean destructible(){
		return true;
	}
}

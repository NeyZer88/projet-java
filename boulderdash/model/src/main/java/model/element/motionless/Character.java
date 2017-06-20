package model.element.motionless;

public class Character extends Alive{
	
	protected static String SPRITE = "HERO.PNG";
	private int mouvement;
	private int x;
	private int y;

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
	
	public void goDown() {
	}
	
	public void goRight(){
	}
	
	public void goUp(){
	}
	
	public void goLeft(){
	}

	public static String getSPRITE() {
		return SPRITE;
	}
}

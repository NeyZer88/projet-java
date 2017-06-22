package model.element.mobile;

import java.awt.Point;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class MobileElement extends Element implements IMobile {
	
	private Point position;
	private Boolean alive = true;
	private IMap map;
	
	private void setHasMoved() {
	}
	
	private int getY() {
		return 0;
	}
	
	private void setY(int i) {
	}
	
	private void setX(int i) {
	}

	private int getX() {
		return 0;
	}
	
	public MobileElement(int x, int y, String SPRITE, Permeability blocking) {
	}

	MobileElement(final int x, final int y, final Sprite sprite, final Permeability permeability){
		
		this.position = new Point();
	}

	@Override
	public void goUp(){
		this.setY(this.getY() -1);
		this.setHasMoved();
	}
	
	@Override
	public void goDown(){
		this.setY(this.getY() +1);
		this.setHasMoved();
	}
	
	@Override
	public void goRight(){
		this.setX(this.getX() +1);
		this.setHasMoved();
	}

	@Override
	public void goLeft(){
		this.setX(this.getX() -1);
		this.setHasMoved();
	}

	protected void die(){
		this.alive = false;
		this.setHasMoved();
	}
}
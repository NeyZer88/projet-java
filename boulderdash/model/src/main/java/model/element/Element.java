package model.element;
import java.awt.image.*;
import model.element.Permeability;

public abstract class Element{

	public static int x;
	public static int y;
	public int HEIGHT = 16;
	public int WIDTH  = 16;
	protected Permeability permeability;
	protected static String sprite;

	public void setSprite(){
	}
	
	public final String getSprite(){
		return this.sprite;
	}

	public final Permeability getPermeability(){
		return this.permeability;
	}
	
	private void setPermeability(final Permeability permeability){
		this.permeability = permeability;
	}
	
	protected boolean destructible(){
	return false;
	}
	
	public boolean superpose(){
	return false;
	}

	public void goUp() {
	}

	public void goDown() {
	}

	public void goRight() {
	}

	public void goLeft() {
	}
}

package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Diamond extends MobileElement{
	
	public Diamond(){
		super(x, y, SPRITE, Permeability.PENETRABLE);
	}

	private static String SPRITE = "DIAMOND.PNG";
	
	public void fall(){
	}
	
	protected boolean destructible(){
		return true;
	}
	
	public void collectable(){
	}
	
}
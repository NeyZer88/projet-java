package model.element.mobile;

import model.element.MobileElement;
import model.element.Permeability;

public class Wallboard extends MobileElement{

	Wallboard() {
		super(x, y, sprite, Permeability.BLOCKING);
	}

	private String SPRITE = "WALLBOARD.PNG";
	
	protected boolean destructible(){
		return false;
	}
}
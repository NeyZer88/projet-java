package model.element.mobile;

import java.io.IOException;

import model.element.MobileElement;
import model.element.Permeability;

public class Rock extends MobileElement {

	public Rock() {
		super(x, y, SPRITE, Permeability.BLOCKING);
	}

	private static final String SPRITE = "ROCK.PNG";
	
	public void fall(){
	}
	
	protected boolean destructible(){
		return false;
	}
}
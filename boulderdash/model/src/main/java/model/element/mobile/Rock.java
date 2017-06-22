package model.element.mobile;

import java.io.IOException;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends MobileElement {
	
	Rock(int x, int y) throws IOException{
		super(x, y, SPRITE, Permeability.BLOCKING);
	}

	private static final String SPRITE = "ROCK.PNG";
	
	protected boolean destructible(){
		return false;
	}
}
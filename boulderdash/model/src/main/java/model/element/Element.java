package model.element;
import java.awt.image.*;
import model.element.Permeability;
import model.Map;

public abstract class Element implements IElement{

	/**
	 * declare variables
	 */
	
	public static int x;
	public static int y;
	public int HEIGHT = 16;
	public int WIDTH  = 16;
	protected Permeability permeability;
	private Map[][] map;
	protected static String sprite;

	/**
	 * Allows to return the value of "Sprite"
	 */
	public void setSprite(){
	}
	
	/**
	 * Allows to create an attribute "Sprite"
	 */
	public final String getSprite(){
		return this.sprite;
	}

	/**
	 * Allows you to create an attribute "Permeability"
	 */
	public final Permeability getPermeability(){
		return this.permeability;
	}
	
	/**
	 * Allows to return the value of Permeability
	 */
	private void setPermeability(final Permeability permeability){
		this.permeability = permeability;
	}
	
	/**
	 * defition of destructible elements
	 */
	protected boolean destructible(){
	return false;
	}
	
	/**
	 * define the caracter when a sprite go on an other
	 */
	public boolean superpose(){
	return false;
	}
	
	public void explode(int x, int y, final Map filler){
		map[x][y+1] = Map.Rock;
		map[x][y] = Map.Empty;
		for (int a = -1; a< 2; a++){
			for (int b = -1; b < 2; b++){
				if (map[x+a][y+b] != Map.Wallboard){
					map[x+a][y+b]  = filler;
				}
			}
		}
	}
}

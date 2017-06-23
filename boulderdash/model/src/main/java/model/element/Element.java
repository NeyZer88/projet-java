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
 * Allows to attibrute a value to Sprite
 */
	public void setSprite(){
	}
	
/**
 *  Allows to return a Sprite
 * @return
 */
	public final String getSprite(){
		return this.sprite;
	}

/**
 * Allows to return the permeability
 * @return
 */
	public final Permeability getPermeability(){
		return this.permeability;
	}
	
/**
 * Allows to attribute a caracteristic to Permeability
 * @param permeability
 */
	private void setPermeability(final Permeability permeability){
		this.permeability = permeability;
	}
	
/**
 * definition of destructible elements
 * @return
 */
	protected boolean destructible(){
	return false;
	}
	
/**
 * define the caracter when a sprite go on an other
 * @return
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
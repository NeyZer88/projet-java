package view;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GamePanel(IGraphicsBuilder applyModelToGraphic, BufferedImage sprite) {
		super();
		this.applyModelToGraphic = applyModelToGraphic;
		this.sprite = sprite;
	}

	protected IGraphicsBuilder applyModelToGraphic;
	
	public IGraphicsBuilder getsIGraphicsBuilder () {
		return applyModelToGraphic;
							
	}
	
	public void setIGraphicsBuilder (IGraphicsBuilder applyModelToGraphic) {
		this.applyModelToGraphic = applyModelToGraphic;
		applyModelToGraphic.setGamePanel (this);
	}
	
	private BufferedImage sprite;
	Graphics g = null;
	
	public GamePanel( ) 
	{
		  
		String adress = "/boulderdash/sprites/";
		String adresseSprite = adress; 
		String message = "diamond needed : " ;
		String messageScore = message;
		
		
		try {
			sprite = ImageIO.read(new File(adresseSprite));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
		g.drawImage(sprite,WIDTH*16,HEIGHT*16, this);
		g.drawString(messageScore , 0 , 650);
		
		
		
		System.out.println(adresseSprite);
	}

	
	//getter and setter
	
	public IGraphicsBuilder getApplyModelToGraphic() {
		return applyModelToGraphic;
	}

	public void setApplyModelToGraphic(IGraphicsBuilder applyModelToGraphic) {
		this.applyModelToGraphic = applyModelToGraphic;
	}

	public BufferedImage getSprite() {
		return sprite;
	}

	public void setSprite(BufferedImage sprite) {
		this.sprite = sprite;
	}

	
}

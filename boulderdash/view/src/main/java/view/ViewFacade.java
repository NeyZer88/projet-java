package view;

import javax.swing.JFrame;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>

 */
public class ViewFacade implements IViewSystem {
	
	String path;
	String message;
	public String SpritePath = "";
	public String MapPath = "";
	protected GraphicsBuilder graphicsBuilders;
	protected GameFrame gameFrame;
	
	public ViewFacade(){
		this.graphicsBuilders = new GraphicsBuilder();
		this.gameFrame = new GameFrame();
		this.graphicsBuilders.setViewFacade(this);
		this.gameFrame.setGameFrame(this);
	}
	
	//affiche la map
	public void displayMaps (int x, int y){
		this.setTitle("Boulderdash");
		this.setSize(x*16, y*16);
		this.setLocationRelativeTo(null);
		this.setResizable(false); //block windows size
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

    /**
     * Instantiates a new view facade.
     */
	

	@Override
	public String displayMessage(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayMap(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	};

}


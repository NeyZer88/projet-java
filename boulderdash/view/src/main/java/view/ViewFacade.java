package view;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>

 */
public class ViewFacade implements IViewSystem {
	
	
	protected GraphicsBuilder graphicsBuilders;
	protected GameFrame gameFrame;
	
	public ViewFacade(){
		this.graphicsBuilders = new GraphicsBuilder();
		this.gameFrame = new GameFrame();
		this.graphicsBuilders.setViewFacade(this);
		this.gameFrame.setGameFrame(this);
	}
	
	public void displayMaps (int x, int y){
		
		
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


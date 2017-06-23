package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * The Class ViewFacade provides a facade of the View component.</h1>
 */

public abstract class ViewFacade extends JFrame implements IViewSystem {
	
	/**
	 * constructor
	 * @param path
	 * @param message
	 * @param spritePath
	 * @param mapPath
	 * @param graphicsBuilders
	 * @param gameFrame
	 * @throws HeadlessException
	 */
	public ViewFacade(String path, String message, String spritePath, String mapPath, GraphicsBuilder graphicsBuilders,
			GameFrame gameFrame) throws HeadlessException {
		super();
		this.path = path;
		this.message = message;
		SpritePath = spritePath;
		MapPath = mapPath;
		this.graphicsBuilders = graphicsBuilders;
		this.gameFrame = gameFrame;
	}

	/**
	 * variable declaration
	 */
	private static final long serialVersionUID = 1L;
	String path;
	String message;
	public String SpritePath = "";
	public String MapPath = "";
	protected GraphicsBuilder graphicsBuilders;
	protected GameFrame gameFrame;
	
	/**
	 * display maps
	 * @param x
	 * @param y
	 */
		public void displayMaps (int x, int y){
			this.setTitle("Boulderdash");
			this.setSize(x*16, y*16);
			this.setLocationRelativeTo(null);
			this.setResizable(false); //block windows size
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		/**
		 * Instantiates a new view facade
		 */

		
	public ViewFacade(){
		this.graphicsBuilders = new GraphicsBuilder();
		this.gameFrame = new GameFrame(null, null, getDefaultCloseOperation());
		this.graphicsBuilders.setViewFacade(this);
		this.gameFrame.setGameFrame(this);
	}
	
	
	
	/**
	 * display a message
	 */

	public String displayMessage(String message) {
		this.setTitle("Boulderdash");
		this.setSize(150, 150);
		this.setLocationRelativeTo(null);
		this.setResizable(false); //block windows size
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return message;
	}
	
	

	
	public void closeAll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	/**
	 * getter and setter
	 * @return
	 */
	

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSpritePath() {
		return SpritePath;
	}

	public void setSpritePath(String spritePath) {
		SpritePath = spritePath;
	}

	public String getMapPath() {
		return MapPath;
	}

	public void setMapPath(String mapPath) {
		MapPath = mapPath;
	}

	public GraphicsBuilder getGraphicsBuilders() {
		return graphicsBuilders;
	}

	public void setGraphicsBuilders(GraphicsBuilder graphicsBuilders) {
		this.graphicsBuilders = graphicsBuilders;
	}

	public GameFrame getGameFrame() {
		return gameFrame;
	}

	public void setGameFrame(GameFrame gameFrame) {
		this.gameFrame = gameFrame;
	}

	

}


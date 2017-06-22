package view;


public interface IGraphicsBuilder {
	protected GamePanel gamePanel;
	
	public default GamePanel getgamePanel(){
		return gamePanel;		
	}
	
	public default void setGamePanel (GamePanel gamePanel){
		this.gamePanel = gamePanel;
	}
	

}

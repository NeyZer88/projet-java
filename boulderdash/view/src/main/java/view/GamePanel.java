package view;

public class GamePanel {
	protected IGraphicsBuilder applyModelToGraphic;
	
	public IGraphicsBuilder gets IGraphicsBuilder () {
		return applyModelToGraphic;
		
	}
	
	public void setIGraphicsBuilder (IGraphicsBuilder applyModelToGraphic) {
		this.applyModelToGraphic = applyModelToGraphic;
		applyModelToGraphic.setGamePanel (this);
	}

}

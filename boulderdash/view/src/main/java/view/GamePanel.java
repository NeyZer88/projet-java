package view;

public class GamePanel {
	protected IGraphicsBuilder applyModelToGraphic;
	
	public IGraphicsBuilder getsIGraphicsBuilder () {
		return applyModelToGraphic;
		
	}
	
	public void setIGraphicsBuilder (IGraphicsBuilder applyModelToGraphic) {
		this.applyModelToGraphic = applyModelToGraphic;
		applyModelToGraphic.setGamePanel (this);
	}

	
	//getter and setter
	
	public IGraphicsBuilder getApplyModelToGraphic() {
		return applyModelToGraphic;
	}

	public void setApplyModelToGraphic(IGraphicsBuilder applyModelToGraphic) {
		this.applyModelToGraphic = applyModelToGraphic;
	}

}

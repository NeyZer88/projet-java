package view;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
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

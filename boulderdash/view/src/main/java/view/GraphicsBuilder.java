package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import model.IModelFacade;
import model.ModelFacade;

/**
 * define the parameter of the view about the model.
 * @author VALENTIN
 *
 */
public class GraphicsBuilder {
	
	private ModelFacade modelFacade;

	public void GraphicBuilder(IModelFacade ModelFacade){
		IModelFacade modelFacade;
		GraphicsBuilder();
			
		
		
	
		
	}



private void GraphicsBuilder() {
	this.modelFacade = new ModelFacade();
	this.modelFacade.setModelFacade(this);
		
	}



public void applyModelToGraphic(Graphics graphics, ImageObserver observer){
	
	
}


int getGlobalWitdh(int globalWidth){
	
	return globalWidth;
	
}

int getGlobalHeight(int globalHeight){

	return globalHeight;
	
}



public ViewFacade setViewFacade(ViewFacade viewFacade) {
	return viewFacade;
	
}

}



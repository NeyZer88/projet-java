package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import model.IModelFacade;

public class GraphicsBuilder {
	
	public IModelFacade GraphicBuilder(IModelFacade ModelFacade){
		IModelFacade modelFacade;
		
		public GraphicsBuilder(){
			this.modelFacade = new ModelFacade();
			this.modelFacade.setModelFacade(this);
		}
		
		
		
	}



public void applyModelToGraphic(Graphics graphics, ImageObserver observer){
	
	
	
}


int getGlobalWitdh(int globalWidth){
	
	return globalWidth;
	
}

int getGlobalHeight(int globalHeight){

	return globalHeight;
	
}

}



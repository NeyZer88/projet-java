package controller;

import java.sql.SQLException;
import java.util.Map;

import model.IModel;
import view.IView;
import view.IViewSystem;
import model.IModelFacade;

public class ControllerFacade implements IOrderPerformer {

    private final IView view;
 
    private final IModel model;
    
    

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
 public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().getLevels());


    } 

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView(){
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel(){
        return this.model;
 
    }
    
  // void displayMessage(String message);
  // void displayMap();
    
    public void setViewSystem(IViewSystem viewsystem){
    	
  
    	viewsystem.displayMap(this.getModel().getLevels());
    	
    	

    }

	public void orderPerform(UserOrder userOrder){
		
		
		
	}
	
	
}

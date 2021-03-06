package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;
import view.IViewSystem;
import view.ViewFacade;
import model.ModelFacade;

public class ControllerFacade implements IOrderPerformer {

    private final IView view;
 
    private final IModel model;
    
    


    /**
     * Instantiates a new controller facade.
     * @param view
     * @param model
     */
    
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

/**
 * 
 * @throws SQLException
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

    /**
     * 
     * @param MapPath
     * 
     * set the MapPath
     */
    
    public void setViewSystem(String MapPath){
    	
    	//path forNumber of diamonds model ==> view
    	    	
    	//path for levels    model ==> view


    	MapPath = getModel().getLevels();
    	
    }

    public void orderPerform(UserOrder userOrder) {
        if (userOrder != null) {
            Direction direction = null;
            Entityable player = this.getModel().getPlayer();
            int x = player.getX();
            int y = player.getY();

            switch (userOrder.getOrder()) {
                case UP:
                    direction = Direction.UP;
                    player.setY(y - 16);
                    break;

                case DOWN:
                    direction = Direction.DOWN;
                    player.setY(y + 16);
                    break;

                case LEFT:
                    direction = Direction.LEFT;
                    player.setX(x - 16);
                    break;

                case RIGHT:
                    direction = Direction.RIGHT;
                    player.setX(x + 16);
                    break;

                case EXIT:
                    this.exitGame();
                    break;

                default:
                    direction = player.getDirection();
            }

            player.setDirection(direction);
        }
    }
	
}

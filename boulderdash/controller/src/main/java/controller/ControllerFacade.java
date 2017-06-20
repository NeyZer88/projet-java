package controller;
import java.sql.SQLException; 
import java.sql.SQLException;
import java.util.List;
import model.Example;
import model.IModel;
import view.IView;
import view.IViewSystem;



public class ControllerFacade implements IOrderPerformer {

    /** The view. */
    private final IView  view;

    /** The model. */
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
        this.getView().displayMessage(this.getModel().getLevel().toString());

        final StringBuilder map = new StringBuilder();
        // a.append(" bar");
       for (final Map map : level) {
            message.append(level);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    } 

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
 
    }
    
    
    public void setViewSystem(final IViewSystem viewSystem)
    {
    	
    }

	public void orderPerform(UserOrder userOrder) {
		
	}
}

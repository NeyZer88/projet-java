package view;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>

 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
	
    public ViewFacade() {
        super();
    }

    /*
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(this, "message\n attention", "boulderdash", JOptionPane.WARNING_MESSAGE);
    }
    
    public void displayMaps(String map){
    	
    }

	@Override
	public void displayMap() {
		// TODO Auto-generated method stub
		
	};

}

package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
        // we try to start the loop, if it fail, there is a trace with the SQL exception
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

} 

package controller;

import model.element.mobile.Character;
/**
 * 
 * @author Starz
 *
 */

public class UserOrder implements IUserOrder {
		
/**
 * 
 * transfer the order from the view to the model
 * 
 * @param order
 */
	public  UserOrder( Order order) {
		
		switch(order)
		{
		
		case UP:
			
			Character.getUP();
			

		case DOWN :
			
			Character.getDOWN();

			
		case LEFT :
			
			Character.getLEFT();

			
		case RIGHT :

			Character.getRIGHT();

		
		}
	
		
	}
	
/**
 * 
 * 
 */
	public Order getOrder(Order order){
		
		
		return order;
		
	}
	
		

	
}
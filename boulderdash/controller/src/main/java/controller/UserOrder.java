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
			
			Character.goUp();
			

		case DOWN :
			
			Character.goDown();

			
		case LEFT :
			
			Character.goLeft();

			
		case RIGHT :

			Character.goRight();

		
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
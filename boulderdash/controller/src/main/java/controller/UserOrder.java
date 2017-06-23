package controller;

import model.element.mobile.Character;

public class UserOrder implements IUserOrder {
		
//player move
		
	//Set the player move
	public  UserOrder(int player , Order order) {
		
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
	
	// Get the player movement

	public Order getOrder(Order order){
		
		
		return order;
		
	}
	
	//Get the player 
		
	public char getPlayer(char player) {
		
		return player;
	}
}
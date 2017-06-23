package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.Order;

public class EventPerformer implements IEventPerformer {
	protected IOrderPerformer orderPerformer;
	
	public IOrderPerformer getIOrderPerformer(){
		
		return orderPerformer;
		
	}
	
	/**
	 * send information about the key pressed
	 * @param e
	 * @return
	 */
	private Object keyCodeToUserOrder (KeyEvent e){
		
		
		if (e.getKeyCode() == KeyEvent.VK_D) {
			move (Order.LEFT);
			Object move = null;
			return move;
			
		}

	    else if (e.getKeyCode() == KeyEvent.VK_Q) {
	    	move (Order.RIGHT);
			Object move = null;
			return move;
	        }

	    else if (e.getKeyCode() == KeyEvent.VK_Z) {
	    	move (Order.UP);
			Object move = null;
			return move;
	        }

	    else if (e.getKeyCode() == KeyEvent.VK_S) {
	    	move (Order.DOWN);
			Object move = null;
			return move;
	        }
		return e;
	    }
		
	

	
	/*
	 * getter and setter
	 */
	
	
	private void move(Order up) {
		// TODO Auto-generated method stub
		
	}

	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}
	
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	public controller.UserOrder getUserOrder() {
		return getUserOrder();
	}


	@Override
	public void setGameFrame(GameFrame gameFrame) {
		
	}
	

}

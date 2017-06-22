package view;

import controller.IOrderPerformer;

public class EventPerformer implements IEventPerformer {
	protected IOrderPerformer orderPerformer;
	
	public IOrderPerformer getIOrderPerformer(){
		return orderPerformer;
		
	}
	
	controller.UserOrder UserOrder = new controller.UserOrder(0, null);
	

}

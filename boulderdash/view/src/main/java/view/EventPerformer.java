package view;

import controller.IOrderPerformer;

public class EventPerformer implements IEventPerformer {
	protected IOrderPerformer orderPerformer;
	
	public IOrderPerformer getIOrderPerformer(){
		return orderPerformer;
		
	}
	
	controller.UserOrder UserOrder = new controller.UserOrder(0, null);

	
	//getter and setter
	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}

	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	public controller.UserOrder getUserOrder() {
		return UserOrder;
	}

	public void setUserOrder(controller.UserOrder userOrder) {
		UserOrder = userOrder;
	}

	@Override
	public void setGameFrame(GameFrame gameFrame) {
		// TODO Auto-generated method stub
		
	}
	

}

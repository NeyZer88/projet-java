package controller;

import java.lang.Override;
import model.element.mobile.Character;
/**
 * 
 * @author Starz
 *
 */

public class UserOrder implements UserOrderable {

	private Order order;

    /**
     * @param order
     */
    public UserOrder(Order order) {
        this.order = order;
    }

    /**
     * @return Order
     */
    @Override
    public Order getOrder() {
        return this.order;
    }
		

	
}
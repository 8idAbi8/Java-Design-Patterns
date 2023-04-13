package designPatterns.command.esempio2;

import java.util.LinkedList;

public class StockBroker {

	private LinkedList<Order> orderList = new LinkedList<>();
	
	// push
	public void placeOrder(Order order) {
		orderList.add(order);
	}
	
	
	// pop  // undo
	public void undo() {
		Order order = orderList.removeLast();
		order.undo();
	}
	
	
	public void executeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		
//		orderList.clear();
	}
}

package designPatterns.visitor.shoppingCard;

import java.util.LinkedList;
import java.util.List;

public class Card {

	private List<Item> items;
	
	public Card() {
		items = new LinkedList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public double getTotalPrice() {
		double totalPrice = 0.0;
		
		for(Item item : items) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

	public List<Item> getItems() {
		return items;					
	}

}

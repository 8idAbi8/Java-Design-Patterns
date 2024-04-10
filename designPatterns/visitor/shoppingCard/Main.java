package designPatterns.visitor.shoppingCard;

public class Main {

	public static void main(String[] args) {
		Card card = new Card();
		Book book1 = new Book("title1", 23.90);
		Book book2 = new Book("title2", 33.90);
		SmartWatch samsungWatch = new SmartWatch("Samsung", 199.99);
		Book book3 = new Book("title3", 16.10);
		
		card.addItem(book1);
		card.addItem(samsungWatch);
		card.addItem(book2);
		card.addItem(book3);
		
		CardTotalCost cardTotalCost = new CardTotalCost(card);
		
		card.getItems();
		System.out.println("Total cost on card: " + cardTotalCost.getTotalCostOnCard());
		System.out.println("Total cost of books: " + cardTotalCost.getTotalCostOfBooks());
		
		card.removeItem(samsungWatch);
		
		card.getItems();
		System.out.println(card.getTotalPrice());
	}
}

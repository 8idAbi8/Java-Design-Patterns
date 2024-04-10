package designPatterns.visitor.shoppingCard;

// Concrete visitor
public class CardTotalCost implements ItemVisitor {

	private double totalCostOnCard;
	private double totalCostOfBooks;
	private Card card;
	
	public CardTotalCost(Card card) {
		this.card = card;
	}

	@Override
	public void visit(Book book) {
		totalCostOnCard += book.getPrice();		
		totalCostOfBooks += book.getPrice();
	}

	@Override
	public void visit(SmartWatch smartWatch) {
		totalCostOnCard += smartWatch.getPrice();		
	}
	
	public double getTotalCostOfBooks() {
		
		double discount1 = (0.05); // sconto del 5 %
		double discount2 = (0.1); // sconto del 10 %
		
		if (totalCostOfBooks >= 100) {
			System.out.println("Sconto de 10% sul totale dei libri");
			totalCostOfBooks = totalCostOfBooks - (totalCostOfBooks * discount2);
		}
		else if (totalCostOfBooks >= 50) {
			System.out.println("Sconto de 5% sul totale dei libri");
			totalCostOfBooks = totalCostOfBooks - (totalCostOfBooks * discount1);
		}
		
		
			
		return totalCostOfBooks;
	}
	
	public double getTotalCostOnCard() {
		for(Item i : card.getItems())
			i.accept(this);
		
		return totalCostOnCard;
	}



}

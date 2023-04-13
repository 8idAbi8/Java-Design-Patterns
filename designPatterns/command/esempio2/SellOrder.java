package designPatterns.command.esempio2;

// comando sell
public class SellOrder implements Order {

	private Stock target;
	private int quantity;
	
	public SellOrder(Stock target, int quantity) {
		this.target = target;
		this.quantity = quantity;
	}


	@Override
	public void execute() {
		target.sellStock(quantity);
	}


	@Override
	public void undo() {
		target.buyStock(quantity);
	}

}

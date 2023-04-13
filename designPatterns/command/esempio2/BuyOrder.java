package designPatterns.command.esempio2;

// comando buy
public class BuyOrder implements Order {

	private Stock target;
	private int quantity;
	
	public BuyOrder(Stock target, int quantity) {
		this.target = target;
		this.quantity = quantity;
	}


	@Override
	public void execute() {
		target.buyStock(quantity);
	}
	
	@Override
	public void undo() {
		target.sellStock(quantity);
	}

}

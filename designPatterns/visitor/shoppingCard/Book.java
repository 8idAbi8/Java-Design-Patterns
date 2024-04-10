package designPatterns.visitor.shoppingCard;

// concrete element
public class Book implements Item {
	protected String type;
	protected String name;
	protected double price;

	public Book(String title, double price) {
		this.name = title;
		this.price = price;
		type = this.getClass().getSimpleName();
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void accept(ItemVisitor visitor) {
		visitor.visit(this);
	}

}

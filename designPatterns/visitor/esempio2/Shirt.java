package designPatterns.visitor.esempio2;

// Concrete Elements
class Shirt extends ClothingItem {
	public Shirt(String name, double price) {
		super(name, price);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);	// PriceCalculatorVisitor.visit(Shirt);
	}
}
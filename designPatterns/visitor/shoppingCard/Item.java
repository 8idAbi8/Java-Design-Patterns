package designPatterns.visitor.shoppingCard;

// Element
public interface Item {
	
	public double getPrice();
	public String getName();
	public String getType();
	
	public void accept(ItemVisitor visitor);
}

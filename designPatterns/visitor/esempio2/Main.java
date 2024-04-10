package designPatterns.visitor.esempio2;

//Client
public class Main {
	public static void main(String[] args) {
		
		// Creazione degli oggetti ClothingItem
		ClothingItem shirt = new Shirt("Red Shirt", 29.99);
		ClothingItem pants = new Pants("Blue Pants", 49.99);
		ClothingItem saleItem = new SaleItem("Sale Item", 39.99, 0.2);

		// Creazione del visitor
		Visitor priceCalculator = new PriceCalculatorVisitor();

		// Chiamata al metodo accept per visitare gli oggetti ClothingItem
		shirt.accept(priceCalculator);
		pants.accept(priceCalculator);
		saleItem.accept(priceCalculator);

		// Calcolo del prezzo totale
		double totalPrice = ((PriceCalculatorVisitor) priceCalculator).getTotalPrice();
		System.out.println("Total price: $" + totalPrice);
	}
}

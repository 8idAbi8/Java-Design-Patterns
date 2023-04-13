package designPatterns.command.esempio2;

public class ClientTest {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		int quantity = 5;
		
		BuyOrder buyOrder = new BuyOrder(stock, quantity);
		BuyOrder buyOrder2 = new BuyOrder(stock, 3);
		
		SellOrder sellOrder = new SellOrder(stock, quantity);
		
		StockBroker stockBroker = new StockBroker();
		
		// comandi
		stockBroker.placeOrder(buyOrder);
		stockBroker.placeOrder(buyOrder2);
		stockBroker.placeOrder(sellOrder);   
		
		// esegue tutti i comandi uno dopo l'altro
		stockBroker.executeOrders();
		
		// undo degli ultimi due comandi
		stockBroker.undo();
		stockBroker.undo();
	}

}

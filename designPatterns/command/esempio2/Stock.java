package designPatterns.command.esempio2;

// questa classe è l'equivalente di Textfile nell'esempio1,
// anche se non hanno la stessa struttura

public class Stock {

	private String stockName = "Google Share";
	private int totalStockQuantity = 0;
	private int quantity;
	private Object lock = new Object();


	public void buyStock(int quantity) {

		synchronized (lock) {

			this.quantity = quantity;
			totalStockQuantity += this.quantity;

			System.out.println("Stock Name: " + stockName + " and Quantity " + quantity + " bought");
			System.out.println("Total quantity = " + totalStockQuantity);

		}
	}

	public void sellStock(int quantity) {

		synchronized (lock) {
			// non possibile vendere stock che non si hanno
			if (totalStockQuantity - quantity < 0)
				throw new IllegalStateException("stockQuantity - quantity < 0");

			this.quantity = quantity;
			totalStockQuantity -= this.quantity;

			System.out.println("Stock Name: " + stockName + " and Quantity " + quantity + " selled");
			System.out.println("Total quantity = " + totalStockQuantity);
		}
	}

}

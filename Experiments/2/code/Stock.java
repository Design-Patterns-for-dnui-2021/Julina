import java.util.ArrayList;
import java.util.Observer;

public abstract class Stock implements Subject {
 
	private String id = "";
	private double price = 100;
	
	public Stock(String id, double price){
		this.id= id;
		this.price= price;
	}
	 
		@Override
		public void registerHolder(StockHolder holder) {
			StockHolder.add(holder);
		}
		
		@Override
		public void removeHolder(StockHolder holder) {
			StockHolder.remove(holder);
		}
		
		@Override
		public void notifyHolders() {
			for (var holder : stockholders) {
				holder.update(id, price);
			}
		}
	 
	public void updatePrice(int price) {
		double oldprice = this.price;
		this.price = price;
		if (Math.abs(price-oldprice)/price > 0.05) {
			super.notifyHolders();
		}
	}
	
			

 

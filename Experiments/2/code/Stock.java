import java.util.ArrayList;

import java.util.Observer;


public abstract class Stock implements Subject {
 
	private String name = "";
	private double price = 100;
		

	public Stock(String name, double price){
		this.name= name;
		this.price= price;
	}
	 
	
		@Override
		public void registerObserver(Observer o) {
			Observer.add(o);
		}
		
		@Override
		public void removeObserver(Observer o) {}
		
		
		@Override
		public void notifyObservers() {
			for (Observer o : observer) {
				o.update(name, price);
			}
		}
	 
	public void updatePrice(int price) {
		double oldprice = this.price;
		this.price = price;
		if (Math.abs(price-oldprice)/price > 0.05) {
			super.notifyObservers();
		}
	}
	
			

 

public class Admin1 implements Observer {
	
	public Admin1(String name) {
	}
	
	@Override
	public void update(String name, double price) {
		System.out.println ("Stock" + name + " is fluctuated more than 5% resulting in price " + price);

	}
	 
}
	


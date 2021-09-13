public class Admin2 implements Observer {
	
	public Admin2(String name) {
	}
 
	@Override
	public void update(String name, double price) {
		System.out.println ("Stock" + name + " is fluctuated more than 5% resulting in price " + price);
	 
	}
	 
}

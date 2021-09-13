public class Admin1 implements Observer {
	public String id;
 
	public Admin1(String id) { 
		this.id = id;
	}
	
	@Override
	public void update(String id, double price) {
		System.out.println ("Stock" + id + " is fluctuated more than 5% resulting in price " + price);

	}
	 
}
	


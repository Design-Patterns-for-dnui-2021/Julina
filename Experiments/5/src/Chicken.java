package src;

public class Chicken implements Waiter {
 
	private Chef chef;
	 
	public Chicken(Chef chef) {
		this.chef = chef;
	 
	}
	 
	public void takeorder() {
		chef.chicken();
	 
	}
	 
}
 
	
	
	

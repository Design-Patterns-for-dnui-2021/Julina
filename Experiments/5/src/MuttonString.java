package src;
public class MuttonString implements Waiter {
 
	private Chef chef;
	 
	public MuttonString(Chef chef) {
		this.chef = chef;
	 
	}
	 
	public void takeorder() {
		chef.muttonstring();
	 
	}
	 
}
 

	

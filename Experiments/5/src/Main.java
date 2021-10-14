package src;
public class Main {

	public static void main(String[] args) {
	
		Chef chef1 = new Chef();
		Chicken chicken = new Chicken(chef1);
		MuttonString muttonstring = new MuttonString(chef1);
		
		Customer Dalia = new Customer(chicken, muttonstring);
		Dalia.chicken();
		Dalia.muttonstring();
		
		
	}

}



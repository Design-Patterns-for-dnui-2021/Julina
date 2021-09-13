
public class test {


public static void main(String[] args) {
	
	Stock h1 = new Stock ("h1, 100");
	Stock h2 = new Stock ("h2, 100");

	h1.registerObserver("Admin1");
	h1.registerObserver("Admin2");
	
	h2.registerObserver("Admin1");
	h2.registerObserver("Admin2");
	
	h1.updatePrice("98");
	h1.updatePrice("92");
	
	h2.updatePrice("98");
	
	
	}

}
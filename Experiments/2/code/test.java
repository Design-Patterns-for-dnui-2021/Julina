
public class test {


public static void main(String[] args) {
	
	Stockholder admin1 = new Admin1();
	Stockholder admin2 = new Admin2(); 
	
	holder h1 = new Stock("h1", 100);
	Stock h2 = new Stock("h2", 100);
	
	h1.registerHolder(admin1);
	h1.registerHolder(admin2);
	
	h2.registerHolder(admin1);
	h2.registerHolder(admin2);
	
	h1.updatePrice(98);
	h1.updatePrice(92);
	
	h2.updatePrice(98);
	h2.updatePrice(92);
}

}
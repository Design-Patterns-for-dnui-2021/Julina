public class Person extends Subject implements Observer, Member {
 
	private String name;
	 
	public Person(String name) {
		this.name = name;
	 
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override 
	public void action() {
		System.out.println(this.name + " Please attack, one of your members got attacked!");
	 
	}
	 
	public void update() {
		System.out.println(this.name + " one of your members got attacked!");
	 
	}
	 
	public void beat() {
		System.out.println(this.name + " got ambushed.");
		this.notifyObservers();
		
	 
	}
	 
}
 

	




public class Test {
 
	public static void main(String[] args) {
		Person Adventurer1 = new Person ("Barbara");
		Person Adventurer2 = new Person ("K");
	
		Adventurer1.registerObserver(Adventurer2);
		Adventurer2.registerObserver(Adventurer1);
		
		Adventurer1.action();
		Adventurer2.beat();
		
		
	}
	 
}


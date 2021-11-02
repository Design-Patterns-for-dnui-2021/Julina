package src;
public class WashingMachine implements ThreePhaseSocket {
 
	@Override
	public void plugin() {
		System.out.println("\nPlease plug in the washing machine before you use.");
	 
	}
	
	@Override 
	public void unplug() {
		System.out.println("To prevent such injuries, it's critical to unplug the washing machine prior to beginning any diagnostic or repair work.");
	
	}
	 
}
 

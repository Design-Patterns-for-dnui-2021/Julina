package src;
public class Tv implements TwoPhaseSocket {
	
	
	@Override
	public void plugin() {
		System.out.println("I went down on one knee to plug in the Tv.");
	 
	}
	 
	@Override
	public void unplug() {
		System.out.println("Please unplug the tv before you go to bed.");
	 
	}
	 
}
 

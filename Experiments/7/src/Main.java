package src;
public class Main {
 
	private ThreePhaseSocket ThreePhaseSocket;
	 
	public static void main(String[] args) {
		
			Tv tv = new Tv();
			WashingMachine wm = new WashingMachine();
			ThreePhaseSocket adaptor = new Adaptor(tv);
			
			tv.plugin();
			tv.unplug();;
	
			wm.plugin();
			wm.unplug();
			
			

		
	 
	}
	 
}
 

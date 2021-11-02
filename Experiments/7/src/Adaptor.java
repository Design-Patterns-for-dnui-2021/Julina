package src;
public class Adaptor implements TwoPhaseSocket, ThreePhaseSocket {
 
	private TwoPhaseSocket TwoPhaseSocket;
	
	 
	public Adaptor(TwoPhaseSocket TwoPhaseSocket) {
		this.TwoPhaseSocket = TwoPhaseSocket;
	 
	}
	
	public void plugin() {
		TwoPhaseSocket.plugin();
	 
	}
	 
	public void unplug() {
		TwoPhaseSocket.unplug();
	 
	}
	 
}
 

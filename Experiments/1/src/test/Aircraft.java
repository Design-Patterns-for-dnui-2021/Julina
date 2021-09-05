
public class Aircraft {
	
	public static void main(String[] args) {
 
		Aircraft Helicopter = new Helicopter();
        Helicopter.settakeoff(new VerticalTakeOff());
        Helicopter.setflight(new SubSonicFly());
        
        Aircraft Airplane = new Airplane();
        Airplane.settakeoff(new LongDistanceTakeOff());
        Airplane.setflight(new SubSonicFly());
        
        Aircraft Fighter = new Fighter();
        Fighter.settakeoff(new LongDistanceTakeOff());
        Fighter.setflight(new SuperSonicFly());
       
        Aircraft Harrier = new Harrier();
        Harrier.settakeoff(new VerticalTakeOff());
        Harrier.setflight(new SuperSonicFly());
        
        
	public void setflight(FlightType flight) {
		this.flight = flight;
	 
	}
	 
	public void settakeoff(TakeOffType takeoff) {
		this.takeoff = takeoff;
	 
	}
	 
	public void AircraftInfo() {
		
	}
	 
	}
	 
}
 

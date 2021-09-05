public class Airplane extends Aircraft{
 @override
 
	public void AircraftInfo() {
	 System.out.println("Airplane:");
	 System.out.print("TakeOffType : ");
		this.takeoff();
	 System.out.print("FlightType : ");
         this.flight();
     System.out.print("\n");
	}
	 
}
 

	 
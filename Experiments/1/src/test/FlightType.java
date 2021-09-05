public interface FlightType {
 
	public abstract void flight();
	
}
 
class SubSonicFly implements FlightType {
 @Override
    public void flight(){
        System.out.println("SubSonicFlight");
    };
}

class SuperSonicFly implements FlightType{
 @Override
    public void flight(){
        System.out.println("SuperSonicFlight");
        
    };
}
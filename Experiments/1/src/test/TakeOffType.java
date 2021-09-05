public interface TakeOffType {
 
	public abstract void takeoff();
}
 
class LongDistanceTakeOff implements TakeOffType{
 @Override
    public void takeoff() { 
        System.out.println("LongDistanceTakeOff");
    }
}
class VerticalTakeOff implements TakeOffType{
 @Override
    public void takeoff() { 
        System.out.println("VerticalTakeOff");
    }
}

public class HaierTV implements TV {

	@Override
	public void play()
	{
		System.out.println("Haier TV now is playing...");
	}

	public TV produceTV() {
		// TODO Auto-generated method stub
		return new HaierTV();
	}

}


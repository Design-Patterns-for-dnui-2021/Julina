public class HisenseTV implements TV {
	
	@Override
	public void play()
	{
		System.out.println("Hisense TV now is playing...");
	}

	public TV produceTV() {
		// TODO Auto-generated method stub
		return HisenseTV();
	}

	private TV HisenseTV() {
		// TODO Auto-generated method stub
		return null;
	}

}


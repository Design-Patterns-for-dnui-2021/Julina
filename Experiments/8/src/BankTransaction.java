package src;

 public abstract class BankTransaction {
	 
	 public final void Transaction() {
		getNumber();
	
		if(performBusiness()) {
			doBusiness();
		}
		
		doBusiness();
		
	 }


	void getNumber() {
		System.out.println("Please get your number to queue.");
	 
	}
	
	abstract void doBusiness();
	
	void doTransaction() {
		System.out.println("Please tap the left button to witdraw the money.");
	}
	
	boolean performBusiness() { 
		return true;
		
	}
}



	


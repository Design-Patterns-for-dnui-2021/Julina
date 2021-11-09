package src;

public class Client {
	 
	public static void main(String[] args) {
		DepositMoney dm = new DepositMoney();
		TransferMoney tm = new TransferMoney();
		WithdrawMoney wm = new WithdrawMoney();
	 
		dm.getNumber();
		System.out.println("\n---New Feature---");
        dm.doBusiness();
        System.out.println("\nPlease wait a moment...");
        tm.doBusiness();
        System.out.println("\n");
        wm.doTransaction();
        System.out.println("Processing...");
        wm.doBusiness();
        
        
	}
	 
}
 
		

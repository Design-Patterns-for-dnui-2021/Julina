import java.util.Scanner;

public class Client {
	
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Application Tasks:");
		
		try {
			System.out.println("---");
			System.out.println(" D. Delete");   
			System.out.println(" A. Abort");  
			System.out.println(" C. Change priority");  
		
			
		sc = new Scanner(System.in);
		while(true) {
			switch (sc.next()) {
				case "D":
					PrintSpoolerSingleton DeletePrint = PrintSpoolerSingleton.getInstance("Delete");
					DeletePrint.manageTasks();
					break;
				case "A":
					PrintSpoolerSingleton AbortPrint = PrintSpoolerSingleton.getInstance("Abort");
					AbortPrint.manageTasks();
					break;
				case "C":
					PrintSpoolerSingleton ChangePriorityPrint = PrintSpoolerSingleton.getInstance("Change priority");
					ChangePriorityPrint.manageTasks();
					break;
				
				default:
					break;
				}
			}
			
		} catch (Exception e) {
			new PrintSpoolerException(e.getMessage());
		}
		
	}

}




		
package week5project;

public class week5assignment {

	public static void main(String[] args) {
		
		//Here I am calling the class AsteriscLogger and printing out log and a new line
		Logger AsteriskLogger = new AsteriskLogger();
		AsteriskLogger.log("Hello");
		
		System.out.println("\n");
		
		//Here I am calling the class AsteriscLogger and printing the log with an error message and a new line
		Logger AsteriskLogger1 = new AsteriskLogger();
		AsteriskLogger1.error("Hello");
		
		System.out.println("\n");
		
//---------------------------------------------------------------		
		
		//Here I am calling the class SpacedLogger and printing out log and a new line 
		Logger SpacedLogger = new SpacedLogger();
		SpacedLogger.log("Hello");
		
		System.out.println("\n");
		
		////Here I am calling the class SpacedLogger and printing out an error message and a new line
		Logger SpacedLogger1 = new SpacedLogger();
		SpacedLogger1.error("Hello");
		
		System.out.println("\n");
	}

}

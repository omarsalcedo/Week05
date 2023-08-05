package week5project;

//Here I am declaring the AsteriskLogger class and implementing the Logger interface
public class AsteriskLogger implements Logger{

	//Here I am using the String argument log from the interface 
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	//Here I am using the String argument error from the interface
	@Override
	public void error(String errorMessage) {
		System.out.println("*****************");
		System.out.println("***Error: "+ errorMessage + "***");
		System.out.println("*****************");
		
		
		
		
	}

}

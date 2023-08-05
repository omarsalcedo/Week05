package week5project;

public class SpacedLogger implements Logger {

	
	//Here I am declaring the SpacedLogger class and implementing the Logger interface
	@Override
	public void log(String message) {
		//I put in a StringBuilder here to put into a for loop and insert a space between each letter in Hello
		StringBuilder spacedWord = new StringBuilder(message);
		for (int i = 1; i < spacedWord.length(); i +=2)
			spacedWord.insert(i, ' ');
		System.out.println(spacedWord.toString());
		
	}

	//I put in a StringBuilder here to put into a for loop and insert a space between each letter in Hello plus an error message before the word
	@Override
	public void error(String errorMessage) {
		StringBuilder spacedWord = new StringBuilder(errorMessage);
		for (int i = 1; i < spacedWord.length(); i +=2)
			spacedWord.insert(i, ' ');
		System.out.println("ERROR: " + spacedWord.toString());
		
	}

}

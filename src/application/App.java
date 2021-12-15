package application;

public class App {

	public static void main(String[] args) {
		String name = "John";
		// "John" is a string literal
		
		System.out.println("My name is " + name);
		
		String text = "I am called: ";
		String endOfSentence = ".";
		
		System.out.println(text + name + endOfSentence);

	}
	
	public String addStrings(String first, String second) {
		return first + second;
	}

}

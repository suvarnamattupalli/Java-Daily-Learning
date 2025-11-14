class Version
{
	static
	{
		System.out.println("Static Method");
	}
}
/*	RunTimeError(After version 6)
javac Version.java
java Version
Error: Main method not found in class Version, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/
class firstProg
{ 	
	public static void main(String args[]) //Entry point of program
	{
		Student student1; //creating reference variable
		student1=new Student(); //object creation
		System.out.println("Before");
		student1.firstMethod(); //object calling
		System.out.println("After");
	}
}
class Student
{
	void firstMethod() //Method implementation
	{
		System.out.println("Hello");
	}
}
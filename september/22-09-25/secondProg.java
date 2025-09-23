class ch
{ 	
	public static void main(String args[])
	{
		Student student1; //Reference variable
		student1=new Student(); //Object
		System.out.println("Before");
		student1.firstMethod(); //Method calling
		student1.secondMethod();
		System.out.println("After");
		student1.fourthMethod(); //Diff methods calling with same obj
		student1.fifthMethod();
		student1.thirdMethod();
	}
}
class Student
{	
	//Different Method Implementations in Same Class
	void firstMethod() 
	{
		System.out.println("This is 1st Method");
	}
	void secondMethod()
	{
		System.out.println("This is 2nd Method");
	}
	void thirdMethod()
	{
		System.out.println("This is 3rd Method");
	}
	void fourthMethod()
	{
		System.out.println("This is 4rth Method");
	}
	void fifthMethod()
	{
		System.out.println("This is 5th Method");
	}

}
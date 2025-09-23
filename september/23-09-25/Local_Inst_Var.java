class Main
{ 	
	public static void main(String args[])
	{
		Student student=new Student();
		student.printMethod();
		System.out.println(student.name2+" Instance variable without initialization");
	}
}
class Student
{
	int num;
	String name2;
	void printMethod()
	{
		String name="Suvarna";
		System.out.println(name+", is Printing Local Variables");
	}
}



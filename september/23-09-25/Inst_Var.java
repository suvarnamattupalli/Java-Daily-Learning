class Main
{ 	
	public static void main(String args[])
	{
		Student student1=new Student();
		student1.roll=12;
		student1.name="Kiran";
		student1.printData(); //Instance variables with assigned values
		Student student2=new Student();
		student2.printData(); //Instance variables with default values
	}
}
class Student
{
	int roll;
	String name;
	void printData()
	{
		System.out.println(roll+" "+name);
	}		
}



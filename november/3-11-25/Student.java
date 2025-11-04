class Student
{
	public static void main(String args[])
	{
		Student stud1=new Student();
		stud1.printData();
		Student stud2=new Student(30,"Kalyani");
		stud2.printData();
	}
	
	int roll;	//instance variables
	String name;
	Student()
	{
		roll=29;
		name="Harish";
	}
	Student(int r,String n)	//local variables
	{
		roll=r;		//local instances
		name=n;
	}
	void printData()
	{
		System.out.println(roll +" "+ name);
	}	
}

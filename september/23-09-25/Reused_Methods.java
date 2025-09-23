class Main
{ 	
	public static void main(String args[])
	{
		Student student=new Student();
		student.roll=12;
		student.m1=13;student.m2=19;student.m3=8;
		student.max_marks=60;
		student.name="Arjun";
		student.section='A';
		student.calTotal();
		student.calPer();
		student.printData();

		Student student2=new Student();
		student2.roll=17;
		student2.m1=1;student2.m2=14;student2.m3=10;
		student2.max_marks=60;
		student2.name="Arun";
		student2.section='C';
		student2.calTotal();
		student2.calPer();
		student2.printData();
	}
}
class Student
{
	int roll,m1,m2,m3;
	String name;
	char section;
	double max_marks=9,total,per;
	void calTotal()
	{
		total=m1+m2+m3;		
	}
	void calPer()
	{
		per=(total/max_marks)*100;
	}
	void printData()
	{
		System.out.println(roll+" "+name+" "+section+" "+total+" "+per);
	}
}



class Main
{ 	
	public static void main(String args[])
	{
		Student s=new Student();
		s.m1=12;s.m2=10;s.m3=14;
		int total = s.calTotal(); //Storing total in variable from the method
		double per=total/60.0*100; //per cal in variable
		System.out.print(total+" "+per);	
	}
}
class Student
{
	int m1,m2,m3;
	int calTotal()
	{
		return m1+m2+m3;	
	}

	
}
/*Output
36 60.0*/

class Ch
{ 	
	public static void main(String args[])
	{
		Student2 stud=new Student2();
		stud.m1=12;stud.m2=12;stud.m3=14;
		System.out.println(stud.calTotal());
		stud.calPer();	
	}
}
class Student2
{
	int m1,m2,m3,total;
	double per;
	int calTotal() //total stored in variable in method itself
	{
		total=m1+m2+m3;
		return total;	
	}
	void calPer() //per cal in method using total var
	{
		per=total/60.0*100;
		System.out.print(per);
	}
	
}
/*Output
38
63.33333333333333*/
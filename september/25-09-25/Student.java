import java.util.Scanner;
class Student
{
	int roll,m1,m2,m3,total;
	String name,email;
	char section;
	double fee,scholarship,ss,donation,d,per,finalTotal;
	
	int calTotal(int m1,int m2,int m3)
	{
		return m1+m2+m3;
	}

	double calPercentage(int total)
	{
		return (total/60.0)*100;
	}
		
	double calScholarship(double per)
	{
		if(per>=80)
			ss=30.0/100*fee;
		else
			ss=10.0/100*fee;
		return ss;
	}
	
	double calDonation(double per)
	{
		if(per<80)
			d=30.0/100*fee;
		else
			d=10.0/100*fee;
		return d;	
	}

	double calFinalTotal(double fee,double scholarship,double donation)
	{
		return fee+donation-scholarship;
	}

	public static void main(String args[])
	{
		Student stud=new Student();

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Roll: ");
		stud.roll=sc.nextInt();

		System.out.print("Enter Name: ");
		stud.name=sc.next();
		
		System.out.print("M1: ");
		stud.m1=sc.nextInt();
		System.out.print("M2: ");
		stud.m2=sc.nextInt();
		System.out.print("M3: ");
		stud.m3=sc.nextInt();

		stud.total=stud.calTotal(stud.m1,stud.m2,stud.m3);

		stud.per=stud.calPercentage(stud.total);

		System.out.print("Enter fee: ");
		stud.fee=sc.nextDouble();
		
		stud.scholarship=stud.calScholarship(stud.per);
		
		stud.donation=stud.calDonation(stud.per);

		stud.finalTotal=stud.calFinalTotal(stud.fee,stud.scholarship,stud.donation);
		
		System.out.print(stud.roll+" "+stud.name+" "+stud.total+" "+stud.per+" "+stud.fee+" "+stud.scholarship+" "+stud.donation+" "+stud.finalTotal);
	}
}
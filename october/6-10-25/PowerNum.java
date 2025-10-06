import java.util.Scanner;
class PowerNum
{ 	
	int addOf(int num)
	{
		int sum=0;
		while(num!=0)
		{	
			sum=sum+(num%10);
			num/=10;	
		}
		return sum;	
	}
	int mulOf(int num)
	{
		int pro=1;
		while(num!=0)
		{	
			pro=pro*(num%10);
			num/=10;	
		}
		return pro;	
	}
	String checkPower(int sum,int pro)
	{
		return (sum==pro)?"Power Num":"Not Power Num";
	}
	public static void main(String a[])
	{
		PowerNum p=new PowerNum();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num:");
		int num=sc.nextInt();
		int sum=p.addOf(num);
		int pro=p.mulOf(num);
		System.out.println(p.checkPower(sum,pro));
	}
}

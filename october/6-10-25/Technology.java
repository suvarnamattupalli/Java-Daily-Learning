import java.util.Scanner;
class Technology
{ 	
	
	int countDigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int splitNum(int num)
	{
		int count=countDigit(num);
		int n1=num/(int)Math.pow(10,count/2);
		int n2=num%(int)Math.pow(10,count/2);
		return n1+n2;
	}
	String checkTech(int num)
	{
		int sum=splitNum(num);
		return sum*sum==num?"Technology Num":"Not Technology Num";
	}
	public static void main(String a[])
	{
		Technology t=new Technology();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num:");
		int num=sc.nextInt();
		System.out.println(t.checkTech(num)); //3025 //2025 //9801
	}
}

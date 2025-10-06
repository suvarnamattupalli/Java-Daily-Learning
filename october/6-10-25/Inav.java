import java.util.Scanner;
class Inav
{
	int sumOfDig(int num)
	{
		while(num>9)
		{
		int sum=0;
		while(num>0)
		{	
			sum=sum+(num%10);
			num/=10;
		}
		//System.out.println(sum);
		num=sum;
		}
		return num;
	}
	String checkInav(int sum)
	{
		return sum==1?"Inav":"Not Inav";
	}
	public static void main(String args[])
	{
		Inav i=new Inav();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int sum=i.sumOfDig(num);
		System.out.println(i.checkInav(sum));
	}
}
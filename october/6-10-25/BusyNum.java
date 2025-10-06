import java.util.Scanner;
class BusyNum
{
	String busy(int n,int num)
	{
		return n==num%10 || num%n==0?"Busy":"Not Busy";
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		
		BusyNum b=new BusyNum();
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int n=7;
		System.out.println(b.busy(n,num));
	}
}
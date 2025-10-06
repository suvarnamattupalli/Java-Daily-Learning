import java.util.Scanner;
class AutomaticNum
{ 	
	int countDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int squareOf(int num)
	{
		int count=countDigits(num);
		return (int)Math.pow(num,2)%(int)Math.pow(10,count);
	}
	String checkAutomatic(int num)
	{
		int sq=squareOf(num);
		return num==sq?"Automatic":"Not Automatic";	
	}
	public static void main(String a[])
	{
		AutomaticNum aa=new AutomaticNum();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num:");
		int num=sc.nextInt();
		System.out.println(aa.checkAutomatic(num));
	}
}

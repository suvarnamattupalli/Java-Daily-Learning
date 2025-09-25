import java.util.Scanner;
class Palindrome
{
	int temp,rev;
	int reverse(int num)
	{
		temp=num;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	void isPal(int result)
	{
		System.out.println(result==temp?"Palindrome":"Not Palindrome");
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num to check Palindrome: ");
		int x=sc.nextInt();
		Palindrome p=new Palindrome();
		int result=p.reverse(x);
		p.isPal(result);
	}
}
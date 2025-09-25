import java.util.Scanner;
class Palindrome
{
	int num,rev;
	int calRev()
	{
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev; // if we not mention return sts it throws error as missing return statement.
	}
	public static void main(String args[])
	{
		Palindrome pal=new Palindrome();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		pal.num=sc.nextInt();
		int temp=pal.num;
		pal.calRev();
		System.out.print(temp==pal.rev?"Palindrome":"Not Palindrome");
	}
}
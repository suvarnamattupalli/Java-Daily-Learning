import java.util.Scanner;
class Prime
{
	int num,count;
	String que;
	int calFactors()
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Prime prime=new Prime();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("Enter a number: ");
			prime.num=sc.nextInt();
			prime.count=0;
			prime.calFactors();
			System.out.println(prime.count==0?"Prime":"Not Prime");
			System.out.print("Do you want to check another num: ");
			prime.que=sc.next();
		}while(prime.que.equals("yes") || prime.que.equals("s")); //equals is a method in String class.
		System.out.print("Thankyou");

	}
}
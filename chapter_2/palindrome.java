class palindrome
{
	public static void main(String args[])
	{
		int num=111564111,rem=0,rev=0,copy=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println((copy==rev)?("Palindrome"):("Not Palindrome"));	
	}
}
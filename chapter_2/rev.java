class rev
{
	public static void main(String args[])
	{
		int num=5385,rem=0,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		
	}
}
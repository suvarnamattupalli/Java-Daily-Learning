class OddSumEO
{
	public static void main(String args[])
	{
		int num=1234564,rem=0,sq=0,sum=0;
		double sqrt=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem%2!=0)
			{
				sum+=rem;
			}
			num/=10;
		}
		System.out.println((sum%2==0)?("Even "+sum):("Odd "+sum));	
	}
}
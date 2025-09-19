class odd //number of odd numbers in a given number
{
	public static void main(String args[])
	{
		int num=455579015,rem=0,count=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem%2!=0)
			{
				count++;
			}
			num/=10;	
		}
		System.out.println(count);
	}
}
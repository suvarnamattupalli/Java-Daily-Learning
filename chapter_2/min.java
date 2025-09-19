class min //min digit in a given number
{
	public static void main(String args[])
	{
		int num=4187,rem=0,min=9;
		while(num!=0)
		{
			rem=num%10;
			if(rem<min)
				min=rem;
			num/=10;
		}
		System.out.println(min);
	}
}
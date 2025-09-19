class SumMinMax
{
	public static void main(String args[])
	{
		int num=123465,min=9,max=0,temp=num,sum=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem<=min)
			{
				min=rem;
			}
			num/=10;
		}
		System.out.println("Minimum: "+min);
		while(temp!=0)
		{
			rem=temp%10;
			if(rem>=max)
			{
				max=rem;
			}
			temp/=10;
		}
		System.out.println("Maximum: "+max);
		System.out.println("Sum: "+(min+max));	
	}
}
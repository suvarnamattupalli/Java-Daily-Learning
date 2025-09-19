class AltDigSum
{
	public static void main(String args[])
	{
		int num=12341,count=0,temp=num,sum=0;
		while(num!=0)
		{	
			count++;
			num/=10;
		}
		while(temp!=0)
		{
		if(count%2!=0)
			sum=sum+(temp%10);
		count--;
		temp/=10;
		}
		System.out.println(sum);
	}
}
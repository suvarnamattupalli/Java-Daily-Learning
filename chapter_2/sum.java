class sum
{
	public static void main(String args[])
	{
		int num=34501,sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num/=10;
		}
		System.out.println(sum);
	}
}

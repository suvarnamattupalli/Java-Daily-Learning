class FirLas
{
	public static void main(String args[])
	{
		int num=2345,first=0,last=0;
		last=num%10;
		while(num>1)
		{
		first=num%10;
		num=num/10;
		}
		num=first+last;
		System.out.println(first+"+"+last+"="+num);
	}
}
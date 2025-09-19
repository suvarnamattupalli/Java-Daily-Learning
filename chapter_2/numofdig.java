class numofdig
{
	public static void main(String args[])
	{
		int num=7865432,count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);	
	}
}

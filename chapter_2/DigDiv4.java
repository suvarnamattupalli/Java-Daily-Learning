class DigDiv4
{
	public static void main(String args[])
	{
		int num=4893,count=0;
		while(num!=0)
		{
			if(num%4==0)
			{
				count++;	
			}
			num/=10;
		}
		System.out.println("Numbers divisible by 4: "+count);
	}
}
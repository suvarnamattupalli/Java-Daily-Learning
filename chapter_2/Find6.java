class Find6
{
	public static void main(String args[])
	{
		int num=134562,count=0;
		while(num!=0)
		{
			if(num%10==6)
			{
				count++;
				break;
				
			}
			num/=10;
		}
		if(count>0)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}
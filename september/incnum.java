class incnum
{
	public static void main(String args[])
	{
		int num=125,count=0,rem=0,diff=0;
		int firdig=(num%10);
		int temp=num/10;
		while(temp!=0)
		{
			count++;
			rem=temp%10;
			diff=firdig-rem;
			if(diff>1)
			{
				System.out.println(firdig-1);
				
			}
			firdig=rem;
		temp/=10;
		}
		

	}
}


class PairAsci
{
	public static void main(String args[])
	{
		int num=8667,count=0,temp=num,rem=0,temp1=num,rem1=0,count2=0,c=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		//System.out.println(count);
		if(count%2==0)
		{
			do
			{
				rem=temp%100;
				temp/=100;
				char ch=(char)rem;
				System.out.println(ch);	
			}
			while(temp!=0);
		}
		else
		{
			c=(count-3)/2;
			//System.out.println(c);
			while(temp1!=0 && c!=0)
			{
				c--;
				rem1=temp1%100;
				temp1/=100;
				char ch=(char)rem1;
				System.out.println(ch);
			}
			System.out.println(temp1);
		}
		
	}
}
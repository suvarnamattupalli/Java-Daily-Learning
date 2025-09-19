class TwistArm
{
	public static void main(String args[])
	{
		int num=1,rev=0,rem=0,temp1=num,temp2=num,temp3=num,count=0,rem2=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
			while(temp2!=0)
			{
				rem=rem+(int)Math.pow((temp2%10),(count));
				temp2/=10;
			}
			if(temp3==rem)
			{
			System.out.println("Armstrong: "+rem);
			while(temp3!=0)
			{
				rem2=rem2+(int)Math.pow((temp3%10),(count));
				temp3/=10;
			}
			System.out.println((temp1==rem2)?("Twisted Armstrong: "+rem2):("Not Twisted Armstrong: "+rem2));
			}
			else
			{
				System.out.println("Not Armstrong");
			}
	
			
	}
}
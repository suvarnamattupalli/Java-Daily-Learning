class Lucky7
{
	public static void main(String args[])
	{
		int num=123321,count=0,temp=num,sum=0,first=0,second=0;
		while(num!=0)
		{	
			count++;
			num/=10;
		}
		first=temp/(int)Math.pow(10,count/2);
		second=temp%(int)Math.pow(10,count/2);
		System.out.println(first);
	}
}
//Added to git
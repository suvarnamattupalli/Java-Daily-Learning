class armstrong
{
	public static void main(String args[])
	{
		int num=371,count=0,temp1=num,temp2=num,ag=0;
		while(num!=0)
		{
			count++;
			num/=10;	
		}
		while(temp1!=0)
		{
			ag=ag+(int)(Math.pow(temp1%10,count));
			temp1/=10;
		}
		System.out.println(ag);
		System.out.println((temp2==ag)?("Armstrong"):("Not Armstrong"));	
	}
}
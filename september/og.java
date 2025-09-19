class og
{
	public static void main(String args[])
	{
		int num=134000,count1=0,count2=0,count=0,rem1=0,rem2=0,rev1=0,rev2=0,copy=num,temp=0;
		System.out.println("Original number: "+num);
		while(num!=0)
		{
			count1++;
			rem1=num%10;
			rev1=rev1*10+rem1;
			num/=10;			
		}
		temp=rev1;
		System.out.println("First Reverse: "+temp);
		while(rev1!=0)
		{
			count2++;
			rem2=rev1%10;
			rev2=rev2*10+rem2;
			rev1/=10;
		}
		count=count1-count2;
		System.out.println("Second Reverse: "+rev2*((int)(Math.pow(10,count))));
				
	}
}


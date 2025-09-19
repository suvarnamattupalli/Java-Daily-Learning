class powers
{
	public static void main(String args[])
	{
		int num=23456,temp=num,count=0,rem=0,rem1=0,powers=0,power=0;
		temp/=10;
		while(num!=0 && temp!=0)
		{
			rem=num%10;
			rem1=temp%10;
			num/=10;
			temp/=10;
			powers=(int)Math.pow(rem,rem1);
			System.out.println(rem+"^"+rem1+"="+powers);
		}
		power=(int)Math.pow(num,num);
		System.out.println(num+"^"+num+"="+power);
	}
}
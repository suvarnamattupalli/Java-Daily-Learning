class PalArm
{
	public static void main(String args[])
	{
		int num=121,rev=0,rem=0,temp2=num,temp3=num,count=0;
		while(num!=0)
		{
			count++;
			rev=rev*10+(num%10);
			num/=10;
		}
		if(temp2==rev)
		{
			System.out.println("Palindrome");
			while(temp2!=0)
			{
				rem=rem+(int)Math.pow((temp2%10),(count));
				temp2/=10;
			}
			System.out.println((temp3==rem)?("Armstrong: "+rem):("Not Armstrong: "+rem));
		}
		else
		{
			System.out.println("Not a Palindrome");
		}	
	}
}
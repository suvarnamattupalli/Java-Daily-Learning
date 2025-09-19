class RepDig
{
	public static void main(String args[])
	{
		int num=3422672,rem=0,rep_dig=2,count=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem==rep_dig)
				count++;
			num/=10;
		}
		System.out.println(rep_dig+" Repeated "+count+" time(s)");	
	}
}
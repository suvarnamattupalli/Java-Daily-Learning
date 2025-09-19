class PerfSq
{
	public static void main(String args[])
	{
		int num=249,rem=0,sqrt=0,sq=0;
		while(num!=0)
		{
			rem=num%10;
			sqrt=(int)Math.sqrt(rem);
			sq=(int)Math.pow(sqrt,2);
			if(rem==sq)
				System.out.println(rem);
			num/=10;
		}
		
		
		//System.out.println();
		
	}
}
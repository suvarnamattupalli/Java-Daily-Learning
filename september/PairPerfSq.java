class PairPerfSq
{
	public static void main(String args[])
	{
		int num=192349,rem=0,sqrt=0,sq=0;
		boolean status=false;
		while(num!=0)
		{
			rem=num%100;
			sqrt=(int)Math.sqrt(rem);
			sq=(int)Math.pow(sqrt,2);
			if(rem==sq)
			{	
				System.out.println(rem);
				status=true;
			}
			num/=100;
		}
		System.out.print((status==true)?("These are Perfect Square Pair(s) in given number"):("No Perfect Square Pairs"));
				
	}
}
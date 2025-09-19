class sq
{
	public static void main(String args[])
	{
		int num=12345,sq=0;
		while(num!=0)
		{
			sq=(int)Math.pow(num%10,2);
			System.out.print(sq+"\t");	
			num/=10;
		}
		
	}
}

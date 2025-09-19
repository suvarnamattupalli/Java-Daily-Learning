class AddOne
{
	public static void main(String args[])
	{
		int num=12391,rem=0,rev=0,r_rem=0,output=0,r=0;
		while(num!=0)
		{
			rem=(num%10)+1;
			if(rem==10)
			{
				r=rem%10;
				rev=rev*10+r;
			}
			else
			{
				rev=rev*10+rem;
			}
			//System.out.println(rev);
			num/=10;
			
		}
		while(rev!=0)
		{
			

			r_rem=rev%10;
			output=output*10+r_rem;
			rev/=10;
		}
		System.out.println(output);

		
	}
}
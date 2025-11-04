class Sum
{
	public static void main(String args[])
	{
		String s="a10b2c14";
		char[] c=s.toCharArray();
		int num=0,sum=0;
		System.out.println("Numbers in String:");
		for(int x=0;x<s.length();x++)
		{
			if(Character.isDigit(c[x]))
			{
				num=num*10+Character.getNumericValue(c[x]);
					if(x==s.length()-1)
					{
						System.out.println(num);
						sum=sum+num;
					}
			}
			else
			{
				System.out.println(num);
				sum=sum+num;
				num=0;
			}
		}
		System.out.println("Sum of Numbers: "+sum);
		
		
	}
	
}

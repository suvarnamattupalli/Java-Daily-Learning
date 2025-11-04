class Sum
{
	public static void main(String args[])
	{
		String s="ab12c4F9d56h1";
		String s1="";
		char[] c=s.toCharArray();
		int num=0,sum=0;
		System.out.println("Numbers in String:");
		for(int x=0;x<s.length();x++)
		{
			if(Character.isDigit(c[x]))//1 //2 //4 //9 //5 //6 //1
			{
				num=num*10+Character.getNumericValue(c[x]);//1 //12 //9 //5 //56 //1
					if(x==s.length()-1)
					{
						System.out.println(num);
						sum=sum+num;
					}
			}
			else
			{
				System.out.println(num);
				sum=sum+num;//12 //16 //25 //81
				num=0;
			}
		}
		System.out.println("Sum of Numbers: "+sum);
		
		
	}
	
}

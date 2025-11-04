class MaxUnisubstring
{
	public static void main(String args[])
	{
		String s="hello",s1="",s3="";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				s1=s.substring(i,j);
				String s2="";
				for(int x=0;x<s1.length();x++)
				{
					char c=s1.charAt(x);
					if(s1.indexOf(c)!=s1.lastIndexOf(c))
					{
						if(s2.indexOf(c)==-1)
						{
							s2+=c;
							break;
						
						}		
					}
				}
				if(s2.length()==0)
				{
					System.out.println(s1);
					if(s1.length()>max)
					{
						max=s1.length();
						s3=s1;
					}
				}
			}
		}
		System.out.println("Max unique substring: "+s3+" its length -> "+max);
		
	}

}